package com.rental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rental.entity.BookEntity;
import com.rental.repository.BookRepository;

import jakarta.transaction.Transactional;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	public boolean insertBook(BookEntity rec)
	{
		String isbnPattern = "^(?:97[89][- ]?\\d{1,5}[- ]?\\d+[- ]?\\d+[- ]?\\d|\\d{3}[- ]?\\d{1,5}[- ]?\\d+[- ]?\\d+[- ]?\\d)$";
		String isbn=rec.getIsbn();
	    if (!isbn.matches(isbnPattern)) {
	        return false;
	    }
		return bookRepository.save(rec)!=null;
	}
	
	@Transactional
	public BookEntity getBook(int bookid)
	{
		java.util.Optional<BookEntity> b=bookRepository.findById(bookid);
		if(b.isPresent())
			return b.get();
		return null;
	}
	
	@Transactional
	public List<BookEntity> getBooks()
	{
		return bookRepository.findAll();
	}
	
	@Transactional
	public List<BookEntity> available()
	{
		return bookRepository.available();
	}
	
	@Transactional
	public boolean modifyBook(BookEntity rec)
	{
		return bookRepository.save(rec)!=null;
	}
	
    public boolean deleteBook(int bookId) {
        if (bookRepository.existsById(bookId)) {
            bookRepository.deleteById(bookId);
            return true;
        }
        return false;
    }
}
