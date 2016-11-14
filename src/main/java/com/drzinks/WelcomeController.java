package com.drzinks;

import org.springframework.stereotype.Component;

import com.vaadin.spring.annotation.UIScope;

@Component
@UIScope
public class WelcomeController {

	
	public String returnSth() {
		return "sth2234567";
	}
}
