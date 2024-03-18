package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepository myBookRepo;
	
	public void saveMyBooks(MyBookList myBookList) {
		myBookRepo.save(myBookList);
		
	}
	public List<MyBookList> getAllMyBooks(){
		return myBookRepo.findAll();
	}
	public void deleteById(int id) {
		myBookRepo.deleteById(id);
	}
	
}
