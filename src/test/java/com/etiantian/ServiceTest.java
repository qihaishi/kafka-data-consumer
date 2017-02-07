package com.etiantian;

import com.etiantian.launcher.SpringContext;
import com.etiantian.service.ServiceFacade;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yuchunfan on 2017/2/7.
 */
public class ServiceTest {
    @Before
    public void doBefore() {
        new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void testReflect() {
        ServiceFacade serviceFacade = SpringContext.getBean("serviceFacade", ServiceFacade.class);
        serviceFacade.doService("tol_question_supplement_info", new JSONObject("{\"query\":{\"question_id\":451151},\"update\":{\"standard_time\":22}}"));
        serviceFacade.doService("TOL_NEWPAPER_DIR_ASSOCIATION", new JSONObject("{\"update\":{\"association\":0.09433962264150944,\"c_time\":\"2017-02-07 11:26:24\",\"dir_id2\":38316,\"cal_date\":\"2017-02-07\",\"dir_id1\":38308}}"));
    }
}
