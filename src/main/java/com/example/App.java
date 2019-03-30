package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * SpringBoot 启动类
 * @author mengke
 *
 */
@SpringBootApplication
@ServletComponentScan //启动时扫描@WebServlet注解，并实例化
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
