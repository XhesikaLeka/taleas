package com.taleas.taleas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	 @RequestMapping("/")
	    public String taleas(){
	        return "Hello Taleas!";
	    }
}
