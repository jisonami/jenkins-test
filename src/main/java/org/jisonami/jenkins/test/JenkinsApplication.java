package org.jisonami.jenkins.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jisonami on 16-9-21.
 */
@SpringBootApplication
@RestController
public class JenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "hello, jenkins...";
    }
}
