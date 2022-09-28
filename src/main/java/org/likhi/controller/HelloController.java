package org.likhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Hi
@RestController
public class HelloController {
	@RequestMapping("/hi{HI}")
	public String sayHello(String a) {
		return a;
	}

}
