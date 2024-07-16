package com.example.dockergithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerGithubActionsApplication {

    @GetMapping("/message")
    public String index(){
        return "Github Actions Demo App";
    }


    public static void main(String[] args) {
        SpringApplication.run(DockerGithubActionsApplication.class, args);
    }

}
