package com.siva.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.siva.components.Book;

@Controller
public class ControllerClass {
	
	@GetMapping("/books")
	public String getBookList( Model model) {
		Book b1 = new Book(101,"book1",100);
		Book b2 = new Book(102,"book2",100);
		Book b3 = new Book(103,"book3",100);
		
		List<Book> asList = Arrays.asList(b1,b2,b3);
		model.addAttribute("books",asList);
		
		return "oneJSP";
	}

}
