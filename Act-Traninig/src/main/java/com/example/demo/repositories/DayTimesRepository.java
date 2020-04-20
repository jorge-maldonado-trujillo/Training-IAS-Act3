package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.demo.time.domain.DayTime;
import com.example.demo.time.domain.Hour;
import com.example.demo.time.domain.Minute;
import com.example.demo.time.domain.Second;

@Repository
@Qualifier("in-memory")
public interface DayTimesRepository {
	DayTime insertOne(Hour hour, Minute minute,Second second);
	
	ArrayList findAll();
	
}
