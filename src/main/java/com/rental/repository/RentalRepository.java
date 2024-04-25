package com.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rental.entity.RentalEntity;


public interface RentalRepository extends JpaRepository<RentalEntity,Integer>{

	@Query(value="select count(*) from rental where bookid=?1 and status=1",nativeQuery=true)
	public int check(int bookid);
	
}
