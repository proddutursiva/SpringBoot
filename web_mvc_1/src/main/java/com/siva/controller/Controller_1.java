package com.siva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_1 {
	
	@GetMapping("/one")
	public ModelAndView printOne() {
		ModelAndView mv = new ModelAndView();
		String[] arr = {"A","B","c"};
		mv.addObject("msg","This is oneJSP");
		mv.setViewName("oneJSP");
		return mv;
	}
	
	@GetMapping("/two")
	public ModelAndView printTwo() {
		ModelAndView mv = new ModelAndView();
		String[] arr = {"A","B","c"};
		mv.addObject("msg","This is TwoJSP");
		mv.setViewName("oneJSP");
		return mv;
	}

}

