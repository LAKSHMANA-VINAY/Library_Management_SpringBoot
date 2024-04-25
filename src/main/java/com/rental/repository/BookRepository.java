package com.rental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rental.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer>{

	@Query(value="select * from book where is_available=0",nativeQuery=true)
	public List<BookEntity> available();
}
