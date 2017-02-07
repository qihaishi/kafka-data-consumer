package com.etiantian.launcher;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by yuchunfan on 2017/2/6.
 */
@Component
public class SpringContext implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public  void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContext.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    public static <T>T getBean(String beanName, Class<T> clazz) {
        return applicationContext.getBean(beanName , clazz);
    }
}
