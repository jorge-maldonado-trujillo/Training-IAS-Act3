package com.example.demo.controllers;

import java.time.LocalTime;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TimeService;
import com.example.demo.time.domain.DayTime;
import com.example.demo.time.domain.Hour;
import com.example.demo.time.domain.HourDay;
import com.example.demo.time.domain.Minute;
import com.example.demo.time.domain.Second;
import com.example.demo.time.domain.UnitTime;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/times")
@RequiredArgsConstructor
public class TimeController {
	
	private final TimeService timeService;
	
	@PostMapping
	public DayTime insertOne(@RequestBody DayTime timeBody){
		return timeService.insertOne(timeBody.getHour(), timeBody.getMinute(), timeBody.getSecond());
		
	}
	
	@GetMapping
	public ArrayList<DayTime> findAll(){
		return timeService.findAll();
		
	}
	

	/*
	@GetMapping("/Hour")
	public HourDay getHour() {
		LocalTime now = LocalTime.now();
		Hour hour = Hour.of(now.getHour());
		Minute minute = Minute.of(now.getMinute());
		Second second = Second.of(now.getSecond());
		
		Long hora = UnitTime.fromHour(UnitTime.HOURS,now);
		Long minuto = UnitTime.fromHour(UnitTime.MINUTES,now);
		Long segundo = UnitTime.fromHour(UnitTime.SECONDS,now);
		Long milisegundo = UnitTime.fromHour(UnitTime.MILLISECONS,now);
		
		return HourDay.from(hour, minute, second, minuto.intValue());
	}
	*/
}
