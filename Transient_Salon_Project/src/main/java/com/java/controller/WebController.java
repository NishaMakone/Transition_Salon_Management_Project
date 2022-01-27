package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.java.repositary.DaoBean;

@Controller
public class WebController {

	@Autowired
	DaoBean dao;
	
	
}
