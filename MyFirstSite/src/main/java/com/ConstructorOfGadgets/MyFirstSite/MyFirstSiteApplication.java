package com.ConstructorOfGadgets.MyFirstSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyFirstSiteApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MyFirstSiteApplication.class, args);
	}


}
