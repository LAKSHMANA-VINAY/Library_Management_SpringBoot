package com.rental.controller;

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

import com.rental.entity.AuthorEntity;
import com.rental.service.AuthorService;

@RestController
public class AuthorController {

	//CRUD OPERATIONS ON AUTHOR
	
	@Autowired
	private AuthorService authorService;
	
	//CREATE
	
	@PostMapping(value="/insertauthor",consumes="application/json")
	public HttpStatus insertAuthor(@RequestBody AuthorEntity rec)
	{
		if(authorService.insertAuthor(rec))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	//READ
	
	@GetMapping(value="/getauthor/{authorid}",produces="application/json")
	public ResponseEntity<AuthorEntity> getAuthor(@PathVariable int authorid)
	{
		AuthorEntity a=authorService.getAuthor(authorid);
		if(a!=null)
			return new ResponseEntity<AuthorEntity>(a,HttpStatus.OK);
		return new ResponseEntity<AuthorEntity>(a,HttpStatus.NOT_FOUND);
	}
	
	//UPDATE
	
	@PutMapping(value="/modifyauthor",consumes="application/json")
	public HttpStatus modifyAuthor(@RequestBody AuthorEntity rec)
	{
		if(authorService.modifyAuthor(rec))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	//DELETE
	
	@DeleteMapping(value="/deleteauthor/{authorid}")
	public HttpStatus deleteAuthor(@PathVariable int authorid)
	{
		if(authorService.deleteAuthor(authorid))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
}
