package com.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rental")
public class RentalEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="bookid")
	private int bookid;
	
	@Column(name="renterName")
	private String renterName;
	
	@Column(name="rentalDate")
	private String rentalDate;

	@Column(name="returnDate")
	private String returnDate;

	@Column(name="status")
	private int status;
	
	public RentalEntity() {}

	public RentalEntity(int id, int bookid, String renterName, String rentalDate, String returnDate, int status) {
		this.id = id;
		this.bookid = bookid;
		this.renterName = renterName;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getRenterName() {
		return renterName;
	}

	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}

	public String getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	

}
