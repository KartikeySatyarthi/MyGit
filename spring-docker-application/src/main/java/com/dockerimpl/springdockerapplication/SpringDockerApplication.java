package com.dockerimpl.springdockerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }


    @GetMapping("/")
    public A hello(){
        A a1 = new A();
        a1.name="car thick hai";
        a1.id = 1;
        return a1;
    }
}

class A{
    public String name;
    public Integer id;
}
