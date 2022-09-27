package com.example.arjun.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.arjun.repository.IContactRepository;
import com.example.arjun.entity.Contact;
@Service
public class IContactService {
	@Autowired 
	private IContactRepository IContactRepository;
	
	 public boolean saveMessage(Contact contact){
	        IContactRepository.save(contact);
	        return true;
	    }
}
