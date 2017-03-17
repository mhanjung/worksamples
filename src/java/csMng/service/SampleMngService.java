package csMng.service;

import java.util.Map;

import ria.xplatform.map.DataSetMap;

/**  
 * @Class Name  : SampleMngService.java
 * @Description : SampleMngService Class
 * @author myunghan
 * @version 1.0
 */
public interface SampleMngService {
    /**
     * search Sample
     */ 
    void searchSample(
            DataSetMap tranInfo,
            Map<String, Object> inVar,  Map<String, DataSetMap> inDataset,
            Map<String, Object> outVar, Map<String, DataSetMap> outDataset) throws Exception;

    /**
     * registry Sample
     */ 
    int registSample(DataSetMap tranInfo, Map inVariableMap, Map inDataSetMap, Map ouVariableMap, Map outDataSetMap) throws Exception;
    
    /**
     * modify Sample
     */ 
    int modifySample(DataSetMap tranInfo, Map inVariableMap, Map inDataSetMap, Map ouVariableMap, Map outDataSetMap) throws Exception;
    
    /**
     * modify Cs Information
     */ 
    int modifyCsInfo(DataSetMap tranInfo, Map inVariableMap, Map inDataSetMap, Map ouVariableMap, Map outDataSetMap) throws Exception;
    
    /**
     * search Change History
     */ 
    void searchChgHst(
            DataSetMap tranInfo,
            Map<String, Object> inVar,  Map<String, DataSetMap> inDataset,
            Map<String, Object> outVar, Map<String, DataSetMap> outDataset) throws Exception;
    
    /**
     * search Member key
     */ 
    void searchMkeySch(
            DataSetMap tranInfo,
            Map<String, Object> inVar,  Map<String, DataSetMap> inDataset,
            Map<String, Object> outVar, Map<String, DataSetMap> outDataset) throws Exception;

}
