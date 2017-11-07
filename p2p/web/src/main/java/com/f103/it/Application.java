package com.f103.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.f103.it")
@RestController
public class Application {
    @RequestMapping("/")
    public String hello(){
        return "start!!!";
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World ! App!" );
        SpringApplication.run(Application.class, args);
        //SpringApplication.run(UserController.class, args);
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
    }
}
