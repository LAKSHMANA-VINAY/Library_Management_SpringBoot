package com.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rental.entity.AuthorEntity;
import com.rental.repository.AuthorRepository;
import jakarta.transaction.Transactional;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	@Transactional
	public boolean insertAuthor(AuthorEntity rec)
	{
		return authorRepository.save(rec)!=null;
	}
	
	@Transactional
	public AuthorEntity getAuthor(int authorid)
	{
		java.util.Optional<AuthorEntity> a=authorRepository.findById(authorid);
		if(a.isPresent())
			return a.get();
		return null;
	}
	
	@Transactional
	public boolean modifyAuthor(AuthorEntity rec)
	{
		return authorRepository.save(rec)!=null;
	}
	
    public boolean deleteAuthor(int authorId) {
        if (authorRepository.existsById(authorId)) {
            authorRepository.deleteById(authorId);
            return true;
        }
        return false;
    }
}
