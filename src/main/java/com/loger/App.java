package com.loger;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

/**
 * @author Loger
 * Date: 2018-08-13
 * TIme: 15:39
 * Description :
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.loger")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
