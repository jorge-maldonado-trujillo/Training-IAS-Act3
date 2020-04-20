package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demo.time.domain.DayTime;
import com.example.demo.time.domain.Hour;
import com.example.demo.time.domain.Minute;
import com.example.demo.time.domain.Second;

@Repository
public class InMemoryDayTimesRepository  implements DayTimesRepository{
	
	private final ArrayList array = new ArrayList();
	
	@Override
	public DayTime insertOne(Hour hour, Minute minute, Second second) {
		DayTime dayTime= DayTime.of(hour,minute,second);
		array.add(dayTime);
		return dayTime;
	}

	@Override
	public ArrayList findAll() {
		// TODO Auto-generated method stub
		return array;
	}

}
