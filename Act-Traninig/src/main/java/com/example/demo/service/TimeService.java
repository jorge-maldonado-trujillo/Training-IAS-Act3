package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.DayTimesRepository;
import com.example.demo.time.domain.DayTime;
import com.example.demo.time.domain.Hour;
import com.example.demo.time.domain.Minute;
import com.example.demo.time.domain.Second;

@Service
public class TimeService {
	private final DayTimesRepository repository ;
	
	
	@Autowired
	public TimeService(DayTimesRepository repository) {
		this.repository = repository;
	}



	public DayTime insertOne(Hour hour, Minute minute,Second second) {
		return repository.insertOne(hour,minute,second);
	}
	
	public ArrayList<DayTime> findAll(){
		return repository.findAll();
	}
        

}


