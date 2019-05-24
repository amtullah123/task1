package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) throws Exception {

        //using applicationContext
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean= (BeanLifecycleDemoBean) context1.getBean("BeanLifecycleDemoBean");
        beanLifecycleDemoBean.customDestroy();
        beanLifecycleDemoBean.destroy();


        Movie movie= (Movie) context1.getBean("movie");
        System.out.println(movie);

        Movie movie1= (Movie) context1.getBean("movie1");
        System.out.println(movie1);
    }
}












