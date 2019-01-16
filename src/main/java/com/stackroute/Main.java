package com.stackroute;

import com.stackroute.config.BeanConfig;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println(context.getBean("movieOne"));
        System.out.println(context.getBean("movieTwo"));
        System.out.println(context.getBean("movieThree"));

        //setter output
        System.out.println(context.getBean("moviez"));
    }
}
