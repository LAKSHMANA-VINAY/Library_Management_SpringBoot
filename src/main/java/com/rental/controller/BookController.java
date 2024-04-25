package com.rental.controller;

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

import com.rental.entity.BookEntity;
import com.rental.service.BookService;


@RestController
public class BookController {

	//CURD OPERATIONS ON BOOK
	
	@Autowired
	private BookService bookService;
	
	//CREATE

	@PostMapping(value="/insertbook",consumes="application/json")
	public HttpStatus insertBook(@RequestBody BookEntity rec) {
		if(bookService.insertBook(rec))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	//READ
	
	// Get a Single book data
	@GetMapping(value="/getbook/{bookid}",produces="application/json")
	public ResponseEntity<BookEntity> getBook(@PathVariable int bookid)
	{
		BookEntity b=bookService.getBook(bookid);
		if(b!=null)
			return new ResponseEntity<BookEntity>(b,HttpStatus.OK);
		return new ResponseEntity<BookEntity>(b,HttpStatus.NOT_FOUND);
	}
	
	//Get all Books
	
	@GetMapping(value="/getbooks",produces="application/json")
	public ResponseEntity<List<BookEntity>> getBooks()
	{
		List<BookEntity> l=bookService.getBooks();
		if(l!=null)
			return new ResponseEntity<List<BookEntity>>(l,HttpStatus.OK);
		return new ResponseEntity<List<BookEntity>>(l,HttpStatus.OK);
	}
	
	//Get all Available Books
	
	@GetMapping(value="/available",produces="application/json")
	public ResponseEntity<List<BookEntity>> available()
	{
		List<BookEntity> l=bookService.available();
		if(l!=null)
			return new ResponseEntity<List<BookEntity>>(l,HttpStatus.OK);
		return new ResponseEntity<List<BookEntity>>(l,HttpStatus.OK);
	}
	
	//UPDATE
	
	@PutMapping(value="/modifybook",consumes="applicatin/json")
	public HttpStatus modifyBook(@RequestBody BookEntity rec)
	{
		if(bookService.modifyBook(rec))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	//DELETE
	
	@DeleteMapping(value="/deleteBook/{bookid}")
	public HttpStatus deleteAuthor(@PathVariable int authorid)
	{
		if(bookService.deleteBook(authorid))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
}
