package com.paazl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringWebservicesTestCaseClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringWebservicesTestCaseClientApplication.class)
			.headless(false)
			.web(false)
			.run(args);
	}
}
