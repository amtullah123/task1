package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie4= (Movie) context1.getBean("movie");
        Movie movie5= (Movie) context1.getBean("movie1");
        System.out.println(movie4==movie5);
    }
}












