package csMng.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ria.xplatform.map.DataSetMap;
import csMng.service.SampleMngService;
import csMng.service.SampleMngVO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import securedb.SecureUtil;

/**
 * @Class Name  : SampleMngServiceImpl.java
 * @Description : SampleMngServiceImpl Class
 * @author myunghan
 * @version 1.0
 */

@Service("sampleMngService")
public class SampleMngServiceImpl extends AbstractServiceImpl implements SampleMngService {
    
    /** sampleMngDAO */
    @Resource(name="sampleMngDAO")
    private SampleMngDAO sampleMngDAO;
    
    /** ID Generation */
    @Resource(name="egovIdGnrService")    
    private EgovIdGnrService egovIdGnrService;
    
    /** SecureUtil */
    @Resource(name="secureUtil")
    private SecureUtil secureUtil;
    
    /**
     * search Sample
     */ 
    @Override
    public void searchSample(
            DataSetMap tranInfo,
            Map<String, Object> inVar,  Map<String, DataSetMap> inDataset,
            Map<String, Object> outVar, Map<String, DataSetMap> outDataset) throws Exception {

        SampleMngVO vo = new SampleMngVO();
        
        if (inVar.isEmpty() != true) {
            vo.setOficeCd((String) inVar.get("oficeCd"));
            vo.setGuCd((String) inVar.get("guCd"));
            vo.setAdstrdCdFrom((String) inVar.get("adstrdCdFrom"));
            vo.setAdstrdCdTo((String) inVar.get("adstrdCdTo"));
            vo.setMkey((String) inVar.get("mkey"));
            vo.setHhldNm((String) inVar.get("hhldNm"));

            if( (String) inVar.get("hhldIdttNo")!= null){
                String hhldIdttNo = secureUtil.encryptionJumin( (String) inVar.get("hhldIdttNo") );
                vo.setHhldIdttNo(hhldIdttNo);
            }

            vo.setRcptNm((String) inVar.get("rcptNm"));

            if( (String) inVar.get("rcptIdttNo")!= null){
                String rcptIdttNo = secureUtil.encryptionJumin( (String) inVar.get("rcptIdttNo") );
                vo.setRcptIdttNo(rcptIdttNo);
            }

            vo.setRcptAprpDeFrom((String) inVar.get("rcptAprpDeFrom"));
            vo.setRcptAprpDeTo((String) inVar.get("rcptAprpDeTo"));
            vo.setRcptSttsCd((String) inVar.get("rcptSttsCd"));
        }
        
        List <Map> records = sampleMngDAO.searchSample(vo);
        
        for(Map map:records){
            map.put("chk", "0");
            map.put("rowStatus", "N");
        }
        
        DataSetMap dsMap = new DataSetMap();
        dsMap.setRowMaps(records);
        
        outDataset.put("ds_output_01", dsMap);
    }

    /**
     * registry Sample
     */ 
    @Override
    public int registSample(DataSetMap tranInfoMap, Map inVariableMap, Map inDataSetMap, Map ouVariableMap, Map outDataSetMap)
            throws Exception {
        
        DataSetMap list = (DataSetMap) inDataSetMap.get("ds_input");
        if (list.size() > 0) {
            Map map = list.get(0);
            String hhldNm = (String) map.get("hhldNm");
            String hhldIdttNo = (String) map.get("hhldIdttNo");
            hhldIdttNo = secureUtil.encryptionJumin( hhldIdttNo );
            map.put("hhldIdttNo", hhldIdttNo);
            map.put("idttNo", hhldIdttNo);
            map.put("nm", hhldNm);
            SampleMngVO vo = new SampleMngVO();
            vo.setIdttNo(hhldIdttNo);
            
            List <Map> records = sampleMngDAO.searchEsntlSeqn(vo);
            
            if( records.size() == 0 ) {
                sampleMngDAO.registEsntlSeqn(map);
                records = sampleMngDAO.searchEsntlSeqn(vo);
            }
            
            int cnt = records.size();
            String esntlSeqn = null;
            
            if(cnt > 0){
                for(int i = 0; i < cnt ; i++){
                    esntlSeqn = (String)records.get(0).get("esntlSeqn");
                }
            }
            
            map.put("hhldEsntlSeqn", esntlSeqn);
            String rcptNm = (String) map.get("rcptNm");
            String rcptIdttNo = (String) map.get("rcptIdttNo");
            rcptIdttNo = secureUtil.encryptionJumin( rcptIdttNo );
            map.put("rcptIdttNo", rcptIdttNo);
            map.put("idttNo", rcptIdttNo);
            map.put("nm", rcptNm);
            SampleMngVO vo2 = new SampleMngVO();
            vo2.setIdttNo(rcptIdttNo);
            List <Map> records2 = sampleMngDAO.searchEsntlSeqn(vo2);
            
            if(records2.size()== 0) {
                sampleMngDAO.registEsntlSeqn(map);
                records2 = sampleMngDAO.searchEsntlSeqn(vo2);
            }
            
            int cnt2 = 0;
            cnt2 = records2.size();
            String esntlSeqn2 = null;
            
            if(cnt2 > 0){
                for(int i = 0; i < cnt2 ; i++){
                    esntlSeqn2 = (String)records2.get(0).get("esntlSeqn");
                    
                }
            }
            
            map.put("rcptEsntlSeqn", esntlSeqn2);
            sampleMngDAO.registSample(map);
            sampleMngDAO.registChgHst(map);
            String tprHdCo = (String) map.get("tprHdCo");
            String mkey = (String) map.get("mkey");
            vo.setTprHdCo(tprHdCo);
            vo.setMkey(mkey);
            List <Map> records3 = sampleMngDAO.searchTprHdCo(vo);
            int cnt3 = 0;
            cnt3 = records3.size();
            String tprHdCoBefore = null;
            
            if(cnt3 > 0){
                for(int i = 0; i < cnt3 ; i++){
                    tprHdCoBefore = String.valueOf(records3.get(0).get("tprHdCo"));
                }
            }
            
            if(! tprHdCoBefore.equals(tprHdCo)){
                map.put("chgBeInfo", tprHdCoBefore);
                map.put("chgAfInfo", tprHdCo);
                sampleMngDAO.registBsisDtChg(map);
            }
        
            sampleMngDAO.modifyCsInfo(map);

            return 0;
        } else {
            return -1;
        }
    }

    /**
     * modify Sample
     */ 
    @Override
    public int modifySample(DataSetMap tranInfoMap, Map inVariableMap, Map inDataSetMap, Map ouVariableMap, Map outDataSetMap) throws Exception {
        
        DataSetMap list = (DataSetMap) inDataSetMap.get("ds_input");
        if (list.size() > 0) {
            Map map = list.get(0);
            String rcptRequNo = (String) map.get("rcptRequNo");
            String rcptSttsCd = (String) map.get("rcptSttsCd");
            SampleMngVO vo = new SampleMngVO();
            vo.setRcptRequNo(rcptRequNo);
            vo.setRcptSttsCd(rcptSttsCd);
            List <Map> records = sampleMngDAO.searchRcptSttsCd(vo);
            String rcptSttsCdBefore = (String)records.get(0).get("rcptSttsCd");
            
            if(! rcptSttsCdBefore.equals(rcptSttsCd) ){
                String rcptIdttNo = (String) map.get("rcptIdttNo");
                String rcptNm = (String) map.get("rcptNm");
                vo.setIdttNo(rcptIdttNo);
                vo.setNm(rcptNm);
                List <Map> records2 = sampleMngDAO.searchEsntlSeqn(vo);
                int cnt = 0;
                cnt = records2.size();
                String esntlSeqn = null;
                
                if(cnt > 0){
                    for(int i = 0; i < cnt ; i++){
                        esntlSeqn = (String)records2.get(0).get("esntlSeqn");
                    }
                }
                
                map.put("rcptEsntlSeqn", esntlSeqn);
                sampleMngDAO.registChgHst(map);
            }

            sampleMngDAO.modifySample(map);
            String tprHdCo = (String) map.get("tprHdCo");
            String mkey = (String) map.get("mkey");
            vo.setTprHdCo(tprHdCo);
            vo.setMkey(mkey);
            List <Map> records3 = sampleMngDAO.searchTprHdCo(vo);
            int cnt3 = 0;
            cnt3 = records3.size();
            String tprHdCoBefore = null;
            
            if(cnt3 > 0){
                for(int i = 0; i < cnt3 ; i++){
                    tprHdCoBefore = String.valueOf(records3.get(0).get("tprHdCo"));
                }
            }

            if(! tprHdCoBefore.equals(tprHdCo)){
                map.put("chgBeInfo", tprHdCoBefore);
                map.put("chgAfInfo", tprHdCo);
                sampleMngDAO.registBsisDtChg(map);
            }
            
            sampleMngDAO.modifyCsInfo(map);
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * modify Cs Information
     */ 
    @Override
    public int modifyCsInfo(DataSetMap tranInfoMap, Map inVariableMap, Map inDataSetMap, Map ouVariableMap, Map outDataSetMap) throws Exception {
        
        DataSetMap list = (DataSetMap) inDataSetMap.get("ds_input");
        if (list.size() > 0) {
            Map map = list.get(0);
            sampleMngDAO.modifyCsInfo(map);
            
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * search Change History
     */ 
    @Override
    public void searchChgHst(
            DataSetMap tranInfo,
            Map<String, Object> inVar,  Map<String, DataSetMap> inDataset,
            Map<String, Object> outVar, Map<String, DataSetMap> outDataset) throws Exception {

        SampleMngVO vo = new SampleMngVO();
        
        if (inVar.isEmpty() != true) {
            vo.setRcptIdttNo((String) inVar.get("rcptIdttNo"));
            vo.setIdttNo((String) inVar.get("rcptIdttNo"));
            vo.setChgDeFrom((String) inVar.get("chgDeFrom"));
            vo.setChgDeTo((String) inVar.get("chgDeTo"));
        }
        
        List <Map> records = sampleMngDAO.searchChgHst(vo);
        
        for(Map map:records){
            map.put("chk", "0");
            map.put("rowStatus", "N");
        }
        
        DataSetMap dsMap = new DataSetMap();
        dsMap.setRowMaps(records);
        
        outDataset.put("ds_output_01", dsMap);
    }
    
    /**
     * search Member key
     */ 
    @Override
    public void searchMkeySch(
            DataSetMap tranInfo,
            Map<String, Object> inVar,  Map<String, DataSetMap> inDataset,
            Map<String, Object> outVar, Map<String, DataSetMap> outDataset) throws Exception {

        SampleMngVO vo = new SampleMngVO();

        if (inVar.isEmpty() != true) {
            vo.setGuCd((String) inVar.get("guCd"));
            vo.setRn((String) inVar.get("rn"));
            vo.setUgAt((String) inVar.get("ugAt"));
            vo.setBldNm((String) inVar.get("bldNm"));
            vo.setBldMnnm((String) inVar.get("bldMnnm"));
            vo.setBldSlno((String) inVar.get("bldSlno"));
            vo.setLgdongCd((String) inVar.get("lgdongCd"));
            vo.setMntn((String) inVar.get("mntn"));
            vo.setMnnm((String) inVar.get("mnnm"));
            vo.setSlno((String) inVar.get("slno"));
            vo.setSpclAddr((String) inVar.get("spclAddr"));
        }
        
        List <Map> records = sampleMngDAO.searchMkeySch(vo);
        
        for(Map map:records){
            map.put("chk", "0");
            map.put("rowStatus", "N");
        }
        
        DataSetMap dsMap = new DataSetMap();
        dsMap.setRowMaps(records);
        
        outDataset.put("ds_output_01", dsMap);
    }
}
