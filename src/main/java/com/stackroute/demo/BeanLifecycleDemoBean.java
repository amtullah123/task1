package com.stackroute.demo;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean , DisposableBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set " + message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy!");
    }

    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }

    public  void customDestroy()
    {
        System.out.println("Method customDestroy() invoked...");
    }
}
