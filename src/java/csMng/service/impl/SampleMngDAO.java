package csMng.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import csMng.service.SampleMngVO;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

/**  
 * @Class Name  : SampleMngDAO.java
 * @Description : SampleMngDAO Class
 * @author myunghan
 * @version 1.0
 */
@Repository("sampleMngDAO")
public class SampleMngDAO extends EgovAbstractDAO {
    
    /**
     * search Sample
     */ 
    public List searchSample(SampleMngVO vo) throws Exception {
        return list("sampleMngDAO.searchSample", vo);
    }

    /**
     * registry Sample
     */ 
    public String registSample(Map<String, Object> map) throws Exception {
        return (String)insert("sampleMngDAO.registSample", map);
    }

    /**
     * modify Sample
     */ 
    public int modifySample(Map<String, Object> map) throws Exception {
        return update("sampleMngDAO.modifySample", map);
    }

    /**
     * modify Cs Information
     */ 
    public int modifyCsInfo(Map<String, Object> map) throws Exception {
        return update("sampleMngDAO.modifyCsInfo", map);
    }

    /**
     * search Change History
     */ 
    public List searchChgHst(SampleMngVO vo) throws Exception {
        return list("sampleMngDAO.searchChgHst", vo);
    }

    /**
     * registry Change History
     */ 
    public String registChgHst(Map<String, Object> map) throws Exception {
        return (String)insert("sampleMngDAO.registChgHst", map);
    }
    
    /**
     * search Member key
     */ 
    public List searchMkeySch(SampleMngVO vo) throws Exception {
        return list("sampleMngDAO.searchMkeySch", vo);
    }
    
    /**
     * search Essential Sequence
     */ 
    public List searchEsntlSeqn(SampleMngVO vo) throws Exception {
        return list("sampleMngDAO.searchEsntlSeqn", vo);
    }
    
    /**
     * registry Essential Sequence
     */ 
    public String registEsntlSeqn(Map<String, Object> map) throws Exception {
        return (String)insert("sampleMngDAO.registEsntlSeqn", map);
    }
    
    /**
     * search Recipient Status Code
     */ 
    public List searchRcptSttsCd(SampleMngVO vo) throws Exception {
        return list("sampleMngDAO.searchRcptSttsCd", vo);
    }
    
    /**
     * search The poor Household Count
     */ 
    public List searchTprHdCo(SampleMngVO vo) throws Exception {
        return list("sampleMngDAO.searchTprHdCo", vo);
    }
    
    /**
     * registry Basic Data Change
     */ 
    public String registBsisDtChg(Map<String, Object> map) throws Exception {
        return (String)insert("sampleMngDAO.registBsisDtChg", map);
    }
    
}
