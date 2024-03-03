package com.siva.service;

import java.util.List;

import com.siva.entity.Book;

public interface Book_interface {
	//insert and update
	public String InsertBook(Book book);
	//for Retrieving
	public List<Book> getAllBook();
	//for delete
	public String deletBook(Integer bookId);
}
