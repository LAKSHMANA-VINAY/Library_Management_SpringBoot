package com.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rental.entity.AuthorEntity;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity,Integer>{

}
