package com.siva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.entity.Book;
import com.siva.repo.BookRepo;

@Service
public class BookImpl implements Book_interface{

	@Autowired
	private BookRepo bookrepo;
	@Override
	public String InsertBook(Book book) {
		Integer bId = book.getBId();
		Book save = bookrepo.save(book);
		if(bId ==null) {
			return "saved successfully";
		}else
		{
			return "updated successfully";
		}
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> all = bookrepo.findAll();
		return all;
	}

	@Override
	public String deletBook(Integer bookId) {
		bookrepo.deleteById(bookId);
		return "deleted successfully";
	}

}
