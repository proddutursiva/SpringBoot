package com.siva.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siva.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Serializable> {

	
}
