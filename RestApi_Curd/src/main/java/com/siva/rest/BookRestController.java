package com.siva.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siva.entity.Book;
import com.siva.service.BookImpl;

import jakarta.transaction.Transactional;

@RestController
@Transactional(rollbackOn=Exception.class)
public class BookRestController {
	@Autowired
	private BookImpl bookImpl;
	
	@PostMapping( value = "/saveBook",
			consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"})
	public ResponseEntity<String> saveBook( @RequestBody Book book){
		System.out.println("book::::"+book);
		String string = bookImpl.InsertBook(book);
		//int i = 1/0;
		return new ResponseEntity<>(string,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getBooks",
			consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"}
	)
	public ResponseEntity<List<Book>> getAllRecords(){
		List<Book> list = bookImpl.getAllBook();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	@PutMapping(value = "/updateBook",
			consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"})
	public ResponseEntity<String> updateBook( @RequestBody Book book){
		String string = bookImpl.InsertBook(book);
		return new ResponseEntity<>(string,HttpStatus.OK);
		
	}
@DeleteMapping(value= "/delete/{bookId}",
consumes= {"application/json","application/xml"},
produces= {"application/json","application/xml"})
	public ResponseEntity<String> deletBook(@PathVariable("bookId") Integer bId){
		String string = bookImpl.deletBook(bId);
		//int i = 1/0;
		return new ResponseEntity<>(string,HttpStatus.OK);
	}
}
