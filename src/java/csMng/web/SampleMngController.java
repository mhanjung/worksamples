package csMng.web;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ria.xplatform.XPlatformConstant;
import ria.xplatform.map.DataSetMap;
import ria.xplatform.map.XPlatformMapDTO;
import csMng.service.SampleMngService;

/**
 * @Class Name  : SampleMngController.java
 * @Description : SampleMngController Class
 * @author myunghan
 * @version 1.0
 */
@Controller
public class SampleMngController {
    
    private Log log = LogFactory.getLog(this.getClass());
    
    /** sampleMngService */
    @Resource(name = "sampleMngService")
    private SampleMngService sampleMngService;
    
    /**
     * search Sample
     */ 
    @RequestMapping(value = "/form/cs/csMng/searchSample.do")
    public ModelAndView searchSample(XPlatformMapDTO xpDto, Model model) throws Exception {
        log.debug("controller :/form/cs/csMng/searchSample.do");
        ModelAndView mav = new ModelAndView("xplatformMapView");

        try{
            DataSetMap tranInfo                 = xpDto.getTranInfoMap();
            Map <String, Object> inVar          = xpDto.getInVariableMap();
            Map <String, DataSetMap> inDataset  = xpDto.getInDataSetMap();
            Map <String, Object> outVar         = xpDto.getOutVariableMap();
            Map <String, DataSetMap> outDataset = xpDto.getOutDataSetMap();
            sampleMngService.searchSample(tranInfo, inVar, inDataset, outVar, outDataset);
            mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME, xpDto.getOutVariableMap());
            mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,   xpDto.getOutDataSetMap());
            mav.addObject(XPlatformConstant.ERROR_CODE, "0");
            mav.addObject(XPlatformConstant.ERROR_MSG, "");
        } catch ( Exception e ){
            e.printStackTrace();
            mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
            mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
        }
        return mav;
    }
    
    /**
     * registry Sample
     */ 
    @RequestMapping(value = "/form/cs/csMng/registSample.do")
    public ModelAndView registSample(XPlatformMapDTO xpDto, Model model) throws Exception {
        log.debug("controller :/form/cs/csMng/registSample.do");
        ModelAndView mav = new ModelAndView("xplatformMapView");    

        try {
            DataSetMap tranInfo                 = xpDto.getTranInfoMap();
            Map <String, Object> inVar          = xpDto.getInVariableMap();
            Map <String, DataSetMap> inDataset  = xpDto.getInDataSetMap();
            Map <String, Object> outVar         = xpDto.getOutVariableMap();
            Map <String, DataSetMap> outDataset = xpDto.getOutDataSetMap();
            sampleMngService.registSample(tranInfo,inVar, inDataset, outVar, outDataset);
            mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME, xpDto.getOutVariableMap());
            mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,   xpDto.getOutDataSetMap());
            mav.addObject(XPlatformConstant.ERROR_CODE, "0");
            mav.addObject(XPlatformConstant.ERROR_MSG, "");
        } catch ( Exception e ){
            e.printStackTrace();
            mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
            mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
        }
        return mav;
    }
    
    /**
     * modify Sample
     */ 
    @RequestMapping(value = "/form/cs/csMng/modifySample.do")
    public ModelAndView modifySample(XPlatformMapDTO xpDto, Model model) throws Exception {
        log.debug("controller :/form/cs/csMng/modifySample.do");
        ModelAndView mav = new ModelAndView("xplatformMapView");    
        
        try {            
            DataSetMap tranInfo                 = xpDto.getTranInfoMap();
            Map <String, Object> inVar          = xpDto.getInVariableMap();
            Map <String, DataSetMap> inDataset  = xpDto.getInDataSetMap();
            Map <String, Object> outVar         = xpDto.getOutVariableMap();
            Map <String, DataSetMap> outDataset = xpDto.getOutDataSetMap();
            sampleMngService.modifySample(tranInfo,inVar, inDataset, outVar, outDataset);
            mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME, xpDto.getOutVariableMap());
            mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,   xpDto.getOutDataSetMap());
            mav.addObject(XPlatformConstant.ERROR_CODE, "0");
            mav.addObject(XPlatformConstant.ERROR_MSG, "");
        } catch ( Exception e ){
            e.printStackTrace();
            mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
            mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
        }
        return mav;
    }
    
    /**
     * modify Cs Information
     */ 
    @RequestMapping(value = "/form/cs/csMng/modifyCsInfo.do")
    public ModelAndView modifyCsInfo(XPlatformMapDTO xpDto, Model model) throws Exception {
        log.debug("controller :/form/cs/csMng/modifyCsInfo.do");
        ModelAndView mav = new ModelAndView("xplatformMapView");    
        
        try {
            DataSetMap tranInfo                 = xpDto.getTranInfoMap();
            Map <String, Object> inVar          = xpDto.getInVariableMap();
            Map <String, DataSetMap> inDataset  = xpDto.getInDataSetMap();
            Map <String, Object> outVar         = xpDto.getOutVariableMap();
            Map <String, DataSetMap> outDataset = xpDto.getOutDataSetMap();
            sampleMngService.modifyCsInfo(tranInfo,inVar, inDataset, outVar, outDataset);
            mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME, xpDto.getOutVariableMap());
            mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,   xpDto.getOutDataSetMap());
            mav.addObject(XPlatformConstant.ERROR_CODE, "0");
            mav.addObject(XPlatformConstant.ERROR_MSG, "");
        } catch ( Exception e ){
            e.printStackTrace();
            mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
            mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
        }
        return mav;
    }
    
    /**
     * search Change History
     */ 
    @RequestMapping(value = "/form/cs/csMng/searchChgHst.do")
    public ModelAndView searchChgHst(XPlatformMapDTO xpDto, Model model) throws Exception {
        log.debug("controller :/form/cs/csMng/searchChgHst.do");
        ModelAndView mav = new ModelAndView("xplatformMapView");    
        
        try {
            DataSetMap tranInfo                 = xpDto.getTranInfoMap();
            Map <String, Object> inVar          = xpDto.getInVariableMap();
            Map <String, DataSetMap> inDataset  = xpDto.getInDataSetMap();
            Map <String, Object> outVar         = xpDto.getOutVariableMap();
            Map <String, DataSetMap> outDataset = xpDto.getOutDataSetMap();
            sampleMngService.searchChgHst(tranInfo,inVar, inDataset, outVar, outDataset);
            mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME, xpDto.getOutVariableMap());
            mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,   xpDto.getOutDataSetMap());
            mav.addObject(XPlatformConstant.ERROR_CODE, "0");
            mav.addObject(XPlatformConstant.ERROR_MSG, "");
        } catch ( Exception e ){
            e.printStackTrace();
            mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
            mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
        }
        return mav;
    }
    
    /**
     * search Member key
     */ 
    @RequestMapping(value = "/form/cs/csMng/searchMkeySch.do")
    public ModelAndView searchMkeySch(XPlatformMapDTO xpDto, Model model) throws Exception {
        log.debug("controller :/form/cs/csMng/searchMkeySch.do");
        ModelAndView mav = new ModelAndView("xplatformMapView");    
        
        try {
            DataSetMap tranInfo                 = xpDto.getTranInfoMap();
            Map <String, Object> inVar          = xpDto.getInVariableMap();
            Map <String, DataSetMap> inDataset  = xpDto.getInDataSetMap();
            Map <String, Object> outVar         = xpDto.getOutVariableMap();
            Map <String, DataSetMap> outDataset = xpDto.getOutDataSetMap();
            sampleMngService.searchMkeySch(tranInfo,inVar, inDataset, outVar, outDataset);
            mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME, xpDto.getOutVariableMap());
            mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,   xpDto.getOutDataSetMap());
            mav.addObject(XPlatformConstant.ERROR_CODE, "0");
            mav.addObject(XPlatformConstant.ERROR_MSG, "");
        } catch ( Exception e ){
            e.printStackTrace();
            mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
            mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
        }
        return mav;
    }
}
