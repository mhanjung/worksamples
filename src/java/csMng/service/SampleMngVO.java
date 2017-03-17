package csMng.service;

import service.PageDefaultVO;


/**  
 * @Class Name  : SampleMngVO.java
 * @Description : SampleMngVO Class
 * @author myunghan
 * @version 1.0
 */
public class SampleMngVO extends PageDefaultVO {
    private static final long serialVersionUID = 1L;

    /** recipient Request Number */
    private String rcptRequNo = "";
    
    /** note */
    private String rm = "";
    
    /** registry Date */
    private String regDt = "";
    
    /** registry ID */
    private String regerId = "";

    /** update Date */
    private String updDt = "";

    /** update ID */
    private String upderId = "";

    /** office Code */
    private String oficeCd = "";

    /** administrative Dong Code */
    private String adstrdCd = "";
    
    /** administrative Dong Code From*/
    private String adstrdCdFrom = "";
    
    /** administrative Dong Code To*/
    private String adstrdCdTo = "";

    /** Member key */
    private String mkey = "";

    /** payment deadline */
    private String appDdtDe = "";

    /** benefit exclusion date */
    private String rcptExclDe = "";

    /** benefit exclusion applied date */
    private String exclAppDdtDe = "";

    /** benefit start date */
    private String rcptAprpDe = "";

    /** benefit start date From*/
    private String rcptAprpDeFrom = "";

    /** benefit start date To*/
    private String rcptAprpDeTo = "";

    /** benefit exclusion Y/N */
    private String rcptExclAt = "";

    /** benefit status code */
    private String rcptSttsCd = "";

    /** benefit exclusion reason */
    private String rcptExclRsn = "";

    /** gu code */
    private String guCd = "";

    /** gu name */
    private String guNm = "";

    /** Household Essential Sequence */
    private String hhldEsntlSeqn = "";

    /** Recipient Essential Sequence */
    private String rcptEsntlSeqn = "";

    /** notice date */
    private String dspthDe = "";

    /** telephone number */
    private String tel = "";

    /** mobile number */
    private String mtel = "";
    
    /** serial number */
    private String sn = "";
    
    /** date of change */
    private String chgDe = "";
    
    /** date of change From */
    private String chgDeFrom = "";
    
    /** date of change To */
    private String chgDeTo = "";
    
    /** reason of change */
    private String chgRsn = "";
    
    /** change Code */
    private String chgSeCd = "";

    /** lgdong code */
    private String lgdongCd = "";

    /** lgdong name */
    private String lgdongNm = "";
    
    /** lgdong code From*/
    private String lgdongCdFrom = "";
    
    /** lgdong code To*/
    private String lgdongCdTo = "";
    
    /** mountain Y/N */
    private String mntn = "";
    
    /** main number */
    private String mnnm = "";
    
    /** secondary number */
    private String slno = "";
    
    /** special address */
    private String spclAddr = "";
    
    /** dong */
    private String dong = "";
    
    /** ho */
    private String ho = "";
    
    /** underground Y/N */
    private String ugAt = "";
    
    /** underground floor number */
    private String ugFloorNo = "";
    
    /** etc address */
    private String etcAddr = "";
    
    /** road name */
    private String rn = "";
    
    /** building main number */
    private String bldMnnm = "";
    
    /** building secondary number */
    private String bldSlno = "";
    
    /** building name */
    private String bldNm = "";

    /** household name */
    private String hhldNm = "";

    /** household ID number */
    private String hhldIdttNo = "";

    /** Recipient name */
    private String rcptNm = "";

    /** Recipient ID number */
    private String rcptIdttNo = "";

    /** qualification cancellation date */
    private String qualfFrfDe = "";

    /** move out date */
    private String mvtDe = "";

    /** encrypted ID number */
    private String idttNo = "";

    /** name */
    private String nm = "";

    /** address */
    private String addr = "";

    /** status name */
    private String sttsNm = "";

    /** building ho */
    private String bldHo = "";

    /** building dong */
    private String bldDong = "";

    /** house count */
    private String hdCo = "";

    /** the poor household count */
    private String tprHdCo = "";

    /** information before change */
    private String chgBeInfo = "";

    /** information after change */
    private String chgAfInfo = "";

    /** Recipient dong ho */
    private String rcptDongHo = "";
    
    /** etc value */
    private String etcVal = "";

    /**
     * @return the rcptRequNo
     */
    public String getRcptRequNo() {
        return rcptRequNo;
    }

    /**
     * @param rcptRequNo the rcptRequNo to set
     */
    public void setRcptRequNo(String rcptRequNo) {
        this.rcptRequNo = rcptRequNo;
    }

    /**
     * @return the rm
     */
    public String getRm() {
        return rm;
    }

    /**
     * @param rm the rm to set
     */
    public void setRm(String rm) {
        this.rm = rm;
    }

    /**
     * @return the regDt
     */
    public String getRegDt() {
        return regDt;
    }

    /**
     * @param regDt the regDt to set
     */
    public void setRegDt(String regDt) {
        this.regDt = regDt;
    }

    /**
     * @return the regerId
     */
    public String getRegerId() {
        return regerId;
    }

    /**
     * @param regerId the regerId to set
     */
    public void setRegerId(String regerId) {
        this.regerId = regerId;
    }

    /**
     * @return the updDt
     */
    public String getUpdDt() {
        return updDt;
    }

    /**
     * @param updDt the updDt to set
     */
    public void setUpdDt(String updDt) {
        this.updDt = updDt;
    }

    /**
     * @return the upderId
     */
    public String getUpderId() {
        return upderId;
    }

    /**
     * @param upderId the upderId to set
     */
    public void setUpderId(String upderId) {
        this.upderId = upderId;
    }

    /**
     * @return the oficeCd
     */
    public String getOficeCd() {
        return oficeCd;
    }

    /**
     * @param oficeCd the oficeCd to set
     */
    public void setOficeCd(String oficeCd) {
        this.oficeCd = oficeCd;
    }

    /**
     * @return the adstrdCd
     */
    public String getAdstrdCd() {
        return adstrdCd;
    }

    /**
     * @param adstrdCd the adstrdCd to set
     */
    public void setAdstrdCd(String adstrdCd) {
        this.adstrdCd = adstrdCd;
    }

    /**
     * @return the adstrdCdFrom
     */
    public String getAdstrdCdFrom() {
        return adstrdCdFrom;
    }

    /**
     * @param adstrdCdFrom the adstrdCdFrom to set
     */
    public void setAdstrdCdFrom(String adstrdCdFrom) {
        this.adstrdCdFrom = adstrdCdFrom;
    }

    /**
     * @return the adstrdCdTo
     */
    public String getAdstrdCdTo() {
        return adstrdCdTo;
    }

    /**
     * @param adstrdCdTo the adstrdCdTo to set
     */
    public void setAdstrdCdTo(String adstrdCdTo) {
        this.adstrdCdTo = adstrdCdTo;
    }

    /**
     * @return the mkey
     */
    public String getMkey() {
        return mkey;
    }

    /**
     * @param mkey the mkey to set
     */
    public void setMkey(String mkey) {
        this.mkey = mkey;
    }

    /**
     * @return the appDdtDe
     */
    public String getAppDdtDe() {
        return appDdtDe;
    }

    /**
     * @param appDdtDe the appDdtDe to set
     */
    public void setAppDdtDe(String appDdtDe) {
        this.appDdtDe = appDdtDe;
    }

    /**
     * @return the rcptExclDe
     */
    public String getRcptExclDe() {
        return rcptExclDe;
    }

    /**
     * @param rcptExclDe the rcptExclDe to set
     */
    public void setRcptExclDe(String rcptExclDe) {
        this.rcptExclDe = rcptExclDe;
    }

    /**
     * @return the exclAppDdtDe
     */
    public String getExclAppDdtDe() {
        return exclAppDdtDe;
    }

    /**
     * @param exclAppDdtDe the exclAppDdtDe to set
     */
    public void setExclAppDdtDe(String exclAppDdtDe) {
        this.exclAppDdtDe = exclAppDdtDe;
    }

    /**
     * @return the rcptAprpDe
     */
    public String getRcptAprpDe() {
        return rcptAprpDe;
    }

    /**
     * @param rcptAprpDe the rcptAprpDe to set
     */
    public void setRcptAprpDe(String rcptAprpDe) {
        this.rcptAprpDe = rcptAprpDe;
    }

    /**
     * @return the rcptAprpDeFrom
     */
    public String getRcptAprpDeFrom() {
        return rcptAprpDeFrom;
    }

    /**
     * @param rcptAprpDeFrom the rcptAprpDeFrom to set
     */
    public void setRcptAprpDeFrom(String rcptAprpDeFrom) {
        this.rcptAprpDeFrom = rcptAprpDeFrom;
    }

    /**
     * @return the rcptAprpDeTo
     */
    public String getRcptAprpDeTo() {
        return rcptAprpDeTo;
    }

    /**
     * @param rcptAprpDeTo the rcptAprpDeTo to set
     */
    public void setRcptAprpDeTo(String rcptAprpDeTo) {
        this.rcptAprpDeTo = rcptAprpDeTo;
    }

    /**
     * @return the rcptExclAt
     */
    public String getRcptExclAt() {
        return rcptExclAt;
    }

    /**
     * @param rcptExclAt the rcptExclAt to set
     */
    public void setRcptExclAt(String rcptExclAt) {
        this.rcptExclAt = rcptExclAt;
    }

    /**
     * @return the rcptSttsCd
     */
    public String getRcptSttsCd() {
        return rcptSttsCd;
    }

    /**
     * @param rcptSttsCd the rcptSttsCd to set
     */
    public void setRcptSttsCd(String rcptSttsCd) {
        this.rcptSttsCd = rcptSttsCd;
    }

    /**
     * @return the rcptExclRsn
     */
    public String getRcptExclRsn() {
        return rcptExclRsn;
    }

    /**
     * @param rcptExclRsn the rcptExclRsn to set
     */
    public void setRcptExclRsn(String rcptExclRsn) {
        this.rcptExclRsn = rcptExclRsn;
    }

    /**
     * @return the guCd
     */
    public String getGuCd() {
        return guCd;
    }

    /**
     * @param guCd the guCd to set
     */
    public void setGuCd(String guCd) {
        this.guCd = guCd;
    }

    /**
     * @return the guNm
     */
    public String getGuNm() {
        return guNm;
    }

    /**
     * @param guNm the guNm to set
     */
    public void setGuNm(String guNm) {
        this.guNm = guNm;
    }

    /**
     * @return the hhldEsntlSeqn
     */
    public String getHhldEsntlSeqn() {
        return hhldEsntlSeqn;
    }

    /**
     * @param hhldEsntlSeqn the hhldEsntlSeqn to set
     */
    public void setHhldEsntlSeqn(String hhldEsntlSeqn) {
        this.hhldEsntlSeqn = hhldEsntlSeqn;
    }

    /**
     * @return the rcptEsntlSeqn
     */
    public String getRcptEsntlSeqn() {
        return rcptEsntlSeqn;
    }

    /**
     * @param rcptEsntlSeqn the rcptEsntlSeqn to set
     */
    public void setRcptEsntlSeqn(String rcptEsntlSeqn) {
        this.rcptEsntlSeqn = rcptEsntlSeqn;
    }

    /**
     * @return the dspthDe
     */
    public String getDspthDe() {
        return dspthDe;
    }

    /**
     * @param dspthDe the dspthDe to set
     */
    public void setDspthDe(String dspthDe) {
        this.dspthDe = dspthDe;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the mtel
     */
    public String getMtel() {
        return mtel;
    }

    /**
     * @param mtel the mtel to set
     */
    public void setMtel(String mtel) {
        this.mtel = mtel;
    }

    /**
     * @return the sn
     */
    public String getSn() {
        return sn;
    }

    /**
     * @param sn the sn to set
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    /**
     * @return the chgDe
     */
    public String getChgDe() {
        return chgDe;
    }

    /**
     * @param chgDe the chgDe to set
     */
    public void setChgDe(String chgDe) {
        this.chgDe = chgDe;
    }

    /**
     * @return the chgDeFrom
     */
    public String getChgDeFrom() {
        return chgDeFrom;
    }

    /**
     * @param chgDeFrom the chgDeFrom to set
     */
    public void setChgDeFrom(String chgDeFrom) {
        this.chgDeFrom = chgDeFrom;
    }

    /**
     * @return the chgDeTo
     */
    public String getChgDeTo() {
        return chgDeTo;
    }

    /**
     * @param chgDeTo the chgDeTo to set
     */
    public void setChgDeTo(String chgDeTo) {
        this.chgDeTo = chgDeTo;
    }

    /**
     * @return the chgRsn
     */
    public String getChgRsn() {
        return chgRsn;
    }

    /**
     * @param chgRsn the chgRsn to set
     */
    public void setChgRsn(String chgRsn) {
        this.chgRsn = chgRsn;
    }

    /**
     * @return the chgSeCd
     */
    public String getChgSeCd() {
        return chgSeCd;
    }

    /**
     * @param chgSeCd the chgSeCd to set
     */
    public void setChgSeCd(String chgSeCd) {
        this.chgSeCd = chgSeCd;
    }

    /**
     * @return the lgdongCd
     */
    public String getLgdongCd() {
        return lgdongCd;
    }

    /**
     * @param lgdongCd the lgdongCd to set
     */
    public void setLgdongCd(String lgdongCd) {
        this.lgdongCd = lgdongCd;
    }

    /**
     * @return the lgdongNm
     */
    public String getLgdongNm() {
        return lgdongNm;
    }

    /**
     * @param lgdongNm the lgdongNm to set
     */
    public void setLgdongNm(String lgdongNm) {
        this.lgdongNm = lgdongNm;
    }

    /**
     * @return the lgdongCdFrom
     */
    public String getLgdongCdFrom() {
        return lgdongCdFrom;
    }

    /**
     * @param lgdongCdFrom the lgdongCdFrom to set
     */
    public void setLgdongCdFrom(String lgdongCdFrom) {
        this.lgdongCdFrom = lgdongCdFrom;
    }

    /**
     * @return the lgdongCdTo
     */
    public String getLgdongCdTo() {
        return lgdongCdTo;
    }

    /**
     * @param lgdongCdTo the lgdongCdTo to set
     */
    public void setLgdongCdTo(String lgdongCdTo) {
        this.lgdongCdTo = lgdongCdTo;
    }

    /**
     * @return the mntn
     */
    public String getMntn() {
        return mntn;
    }

    /**
     * @param mntn the mntn to set
     */
    public void setMntn(String mntn) {
        this.mntn = mntn;
    }

    /**
     * @return the mnnm
     */
    public String getMnnm() {
        return mnnm;
    }

    /**
     * @param mnnm the mnnm to set
     */
    public void setMnnm(String mnnm) {
        this.mnnm = mnnm;
    }

    /**
     * @return the slno
     */
    public String getSlno() {
        return slno;
    }

    /**
     * @param slno the slno to set
     */
    public void setSlno(String slno) {
        this.slno = slno;
    }

    /**
     * @return the spclAddr
     */
    public String getSpclAddr() {
        return spclAddr;
    }

    /**
     * @param spclAddr the spclAddr to set
     */
    public void setSpclAddr(String spclAddr) {
        this.spclAddr = spclAddr;
    }

    /**
     * @return the dong
     */
    public String getDong() {
        return dong;
    }

    /**
     * @param dong the dong to set
     */
    public void setDong(String dong) {
        this.dong = dong;
    }

    /**
     * @return the ho
     */
    public String getHo() {
        return ho;
    }

    /**
     * @param ho the ho to set
     */
    public void setHo(String ho) {
        this.ho = ho;
    }

    /**
     * @return the ugAt
     */
    public String getUgAt() {
        return ugAt;
    }

    /**
     * @param ugAt the ugAt to set
     */
    public void setUgAt(String ugAt) {
        this.ugAt = ugAt;
    }

    /**
     * @return the ugFloorNo
     */
    public String getUgFloorNo() {
        return ugFloorNo;
    }

    /**
     * @param ugFloorNo the ugFloorNo to set
     */
    public void setUgFloorNo(String ugFloorNo) {
        this.ugFloorNo = ugFloorNo;
    }

    /**
     * @return the etcAddr
     */
    public String getEtcAddr() {
        return etcAddr;
    }

    /**
     * @param etcAddr the etcAddr to set
     */
    public void setEtcAddr(String etcAddr) {
        this.etcAddr = etcAddr;
    }

    /**
     * @return the rn
     */
    public String getRn() {
        return rn;
    }

    /**
     * @param rn the rn to set
     */
    public void setRn(String rn) {
        this.rn = rn;
    }

    /**
     * @return the bldMnnm
     */
    public String getBldMnnm() {
        return bldMnnm;
    }

    /**
     * @param bldMnnm the bldMnnm to set
     */
    public void setBldMnnm(String bldMnnm) {
        this.bldMnnm = bldMnnm;
    }

    /**
     * @return the bldSlno
     */
    public String getBldSlno() {
        return bldSlno;
    }

    /**
     * @param bldSlno the bldSlno to set
     */
    public void setBldSlno(String bldSlno) {
        this.bldSlno = bldSlno;
    }

    /**
     * @return the bldNm
     */
    public String getBldNm() {
        return bldNm;
    }

    /**
     * @param bldNm the bldNm to set
     */
    public void setBldNm(String bldNm) {
        this.bldNm = bldNm;
    }

    /**
     * @return the hhldNm
     */
    public String getHhldNm() {
        return hhldNm;
    }

    /**
     * @param hhldNm the hhldNm to set
     */
    public void setHhldNm(String hhldNm) {
        this.hhldNm = hhldNm;
    }

    /**
     * @return the hhldIdttNo
     */
    public String getHhldIdttNo() {
        return hhldIdttNo;
    }

    /**
     * @param hhldIdttNo the hhldIdttNo to set
     */
    public void setHhldIdttNo(String hhldIdttNo) {
        this.hhldIdttNo = hhldIdttNo;
    }

    /**
     * @return the rcptNm
     */
    public String getRcptNm() {
        return rcptNm;
    }

    /**
     * @param rcptNm the rcptNm to set
     */
    public void setRcptNm(String rcptNm) {
        this.rcptNm = rcptNm;
    }

    /**
     * @return the rcptIdttNo
     */
    public String getRcptIdttNo() {
        return rcptIdttNo;
    }

    /**
     * @param rcptIdttNo the rcptIdttNo to set
     */
    public void setRcptIdttNo(String rcptIdttNo) {
        this.rcptIdttNo = rcptIdttNo;
    }

    /**
     * @return the qualfFrfDe
     */
    public String getQualfFrfDe() {
        return qualfFrfDe;
    }

    /**
     * @param qualfFrfDe the qualfFrfDe to set
     */
    public void setQualfFrfDe(String qualfFrfDe) {
        this.qualfFrfDe = qualfFrfDe;
    }

    /**
     * @return the mvtDe
     */
    public String getMvtDe() {
        return mvtDe;
    }

    /**
     * @param mvtDe the mvtDe to set
     */
    public void setMvtDe(String mvtDe) {
        this.mvtDe = mvtDe;
    }

    /**
     * @return the idttNo
     */
    public String getIdttNo() {
        return idttNo;
    }

    /**
     * @param idttNo the idttNo to set
     */
    public void setIdttNo(String idttNo) {
        this.idttNo = idttNo;
    }

    /**
     * @return the nm
     */
    public String getNm() {
        return nm;
    }

    /**
     * @param nm the nm to set
     */
    public void setNm(String nm) {
        this.nm = nm;
    }

    /**
     * @return the addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr the addr to set
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return the sttsNm
     */
    public String getSttsNm() {
        return sttsNm;
    }

    /**
     * @param sttsNm the sttsNm to set
     */
    public void setSttsNm(String sttsNm) {
        this.sttsNm = sttsNm;
    }

    /**
     * @return the bldHo
     */
    public String getBldHo() {
        return bldHo;
    }

    /**
     * @param bldHo the bldHo to set
     */
    public void setBldHo(String bldHo) {
        this.bldHo = bldHo;
    }

    /**
     * @return the bldDong
     */
    public String getBldDong() {
        return bldDong;
    }

    /**
     * @param bldDong the bldDong to set
     */
    public void setBldDong(String bldDong) {
        this.bldDong = bldDong;
    }

    /**
     * @return the hdCo
     */
    public String getHdCo() {
        return hdCo;
    }

    /**
     * @param hdCo the hdCo to set
     */
    public void setHdCo(String hdCo) {
        this.hdCo = hdCo;
    }

    /**
     * @return the tprHdCo
     */
    public String getTprHdCo() {
        return tprHdCo;
    }

    /**
     * @param tprHdCo the tprHdCo to set
     */
    public void setTprHdCo(String tprHdCo) {
        this.tprHdCo = tprHdCo;
    }

    /**
     * @return the chgBeInfo
     */
    public String getChgBeInfo() {
        return chgBeInfo;
    }

    /**
     * @param chgBeInfo the chgBeInfo to set
     */
    public void setChgBeInfo(String chgBeInfo) {
        this.chgBeInfo = chgBeInfo;
    }

    /**
     * @return the chgAfInfo
     */
    public String getChgAfInfo() {
        return chgAfInfo;
    }

    /**
     * @param chgAfInfo the chgAfInfo to set
     */
    public void setChgAfInfo(String chgAfInfo) {
        this.chgAfInfo = chgAfInfo;
    }

    /**
     * @return the rcptDongHo
     */
    public String getRcptDongHo() {
        return rcptDongHo;
    }

    /**
     * @param rcptDongHo the rcptDongHo to set
     */
    public void setRcptDongHo(String rcptDongHo) {
        this.rcptDongHo = rcptDongHo;
    }

    /**
     * @return the etcVal
     */
    public String getEtcVal() {
        return etcVal;
    }

    /**
     * @param etcVal the etcVal to set
     */
    public void setEtcVal(String etcVal) {
        this.etcVal = etcVal;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    
    
}
