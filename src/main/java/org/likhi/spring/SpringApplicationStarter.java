package org.likhi.spring;

import org.likhi.controller.ItemController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = ItemController.class)
public class SpringApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationStarter.class, args);

	}
}
