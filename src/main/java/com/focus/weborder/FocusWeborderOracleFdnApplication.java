package com.focus.weborder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class FocusWeborderOracleFdnApplication 
	extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FocusWeborderOracleFdnApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(
    		SpringApplicationBuilder focusWeborderOracleFdnApplication) {
        return focusWeborderOracleFdnApplication.sources(
        		FocusWeborderOracleFdnApplication.class);
    }
}
