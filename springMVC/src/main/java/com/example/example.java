package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/two")
public class example {

	@RequestMapping(method = RequestMethod.GET)
	public String display() {
		return "helloworld";
	}

}
