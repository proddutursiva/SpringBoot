package com.siva;

import java.io.File;

import com.bean.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Book book = new Book();
    	book.setBookId(102);
    	book.setBookName("sreeRagavendra");
    	
    	ObjectMapper mapper = new ObjectMapper();
    	//writeAsJson(mapper,book);
    	readAsJson(mapper,book);
    }
    
    public static void writeAsJson(ObjectMapper mapper,Book book) throws Exception {
    	mapper.writeValue(new File("Book.json"),book);
    	System.out.println("writeen as json file");
    }
    public  static void readAsJson(ObjectMapper mapper,Book book)throws Exception {
    	File f = new File("Book.json");
    	Book book2 = mapper.readValue(f,Book.class);
    	System.out.println("book2:::::: "+book2);
    }
}
