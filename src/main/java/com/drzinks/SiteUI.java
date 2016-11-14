package com.drzinks;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class SiteUI extends UI {
	
	@Autowired
	private WelcomeController welcomeController;
	private VerticalLayout layout;
	
	
	@Override
	protected void init(VaadinRequest request) {
		setupLayout();
		addHeader();
		
	}

	
	private void setupLayout() {
		layout = new VerticalLayout(); //alt shift l extr local var
		setContent(layout);
	
	}
	
	private void addHeader() {
		Label label = new Label(welcomeController.returnSth());
		layout.addComponent(label);		
	}

}
