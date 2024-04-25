package com.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rental.entity.RentalEntity;
import com.rental.service.RentalService;

@RestController
public class RentalController {

	@Autowired
	private RentalService rentalService;
	
	@PostMapping(value="/book",consumes="application/json")
	public HttpStatus book(@RequestBody RentalEntity rec)
	{
		if(rentalService.book(rec))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	@PutMapping(value="/changestatus/{rentid}")
	public HttpStatus changeStatus(@PathVariable int rentid)
	{
		if(rentalService.changeStatus(rentid))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
}
