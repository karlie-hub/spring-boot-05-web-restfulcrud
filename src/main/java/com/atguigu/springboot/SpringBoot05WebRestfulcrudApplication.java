package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBoot05WebRestfulcrudApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot05WebRestfulcrudApplication.class, args);
    }
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }
    public static class MyViewResolver implements ViewResolver{


        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }

}
