package com.stackroute.awareInterface;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareDemo implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        System.out.println("beanName is" +s);
    }
}
