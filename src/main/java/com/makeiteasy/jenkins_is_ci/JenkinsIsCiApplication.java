package com.makeiteasy.jenkins_is_ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsIsCiApplication {
    @GetMapping("/sanity/{sample}")
	public String sanityCheck(@PathVariable String sample){
		sample=sample.split(" ")[0];
		return "Java Made Easy";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsIsCiApplication.class, args);
	}

}
