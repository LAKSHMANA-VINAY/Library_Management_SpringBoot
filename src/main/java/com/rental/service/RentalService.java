package com.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rental.entity.RentalEntity;
import com.rental.repository.RentalRepository;
import com.rental.repository.UpdateRepository;

@Service
public class RentalService {

	@Autowired
	private RentalRepository rentalRepository;
	
	@Autowired
	private UpdateRepository updateRepository;
	
	public boolean book(RentalEntity rec)
	{
		int bookid=rec.getBookid();
		if(rentalRepository.check(bookid)>0)
			return false;
		updateRepository.updateRecord(bookid);//Changing Status of Book To Booked(1)
		return rentalRepository.save(rec)!=null;
	}
	
	public boolean changeStatus(int rentid)
	{
		if(rentalRepository.existsById(rentid))
		{
			updateRepository.update(rentid);
			java.util.Optional<RentalEntity> b=rentalRepository.findById(rentid);
			RentalEntity rec=b.get();
			updateRepository.updateBook(rec.getBookid());//Changing Status of BooK To Available(0)
			return true;
		}
		return false;
	}
}
