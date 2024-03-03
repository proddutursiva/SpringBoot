package com.siva.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.siva.component.Product;

@RestController
public class Controller_1 {
	//http://localhost:8011/welcome?name=siva
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(@RequestParam("name") String name){
		
		String payload = name+" welcome to RestController";
		return new ResponseEntity<>(payload,HttpStatus.OK);
	}
	//http://localhost:8011/getfee?name=siva&fee=20
	@GetMapping("/getfee")
	public String getfee(@RequestParam("name") String name,@RequestParam("fee") int fee){
		
		String payload = name+" your fee ampount is ::: "+fee;
		return payload;
	}
	//Path Param Example
	//http://localhost:8011/book/YOGA/author/Yogi sathyanadh
	@GetMapping("/book/{name}/author/{aname}")
	public ResponseEntity<String> bookDetails(@PathVariable("name")String name, @PathVariable("aname")String aname ){
		
		String bookde = name+" by "+aname+" is not available ";
		return new ResponseEntity<>(bookde,HttpStatus.OK);
	}
	
	@GetMapping(value = "/product",
			produces = {"application/json","application/xml"})
	public ResponseEntity<List<Product>> getProduct(){
		Product obj1 = new Product(101,"mouse",300.00);
		Product obj2 = new Product(101,"mouse",300.00);
		Product obj3 = new Product(101,"mouse",300.00);
		List<Product> asList = Arrays.asList(obj1,obj2,obj3);
		
		return new ResponseEntity<>(asList,HttpStatus.OK);
	}
	@PostMapping(value ="/insertproduct",
			consumes = {"application/json","application/xml"}
			)
	public ResponseEntity<String> inserProduct(@RequestBody Product prod){
		System.out.println("prod::::"+prod);
		String str = "insted successfully";
		return new ResponseEntity<>(str,HttpStatus.CREATED);
	}

}
