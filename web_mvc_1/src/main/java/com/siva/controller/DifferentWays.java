package com.siva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DifferentWays {

	@GetMapping("/app1")
	public ModelAndView approuch1() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","This form approuch1");
		mav.setViewName("oneJSP");
		return mav;
	}
	
	@GetMapping("/app2")
	public String  approuch2( Model model) {
		model.addAttribute("msg","This from approuch2 :::: 1111");
		return "twoJSP";
	}
	
	@GetMapping("/app3")
	@ResponseBody
	public String  approuch3() {
		return "Direct message";
	}
}
