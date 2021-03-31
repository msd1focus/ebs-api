package com.focus.weborder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class FocusEbsApiApplication 
	extends SpringBootServletInitializer
	{

	public static void main(String[] args) {
		SpringApplication.run(FocusEbsApiApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(
    		SpringApplicationBuilder FocusEbsApiApplication) {
        return FocusEbsApiApplication.sources(
        		FocusEbsApiApplication.class);
    }
}
