package com.example.demo.time.domain;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;

public enum UnitTime {
	HOURS, 
	MINUTES,
	SECONDS,
	MILLISECONS;
	
	@Bean()
	public static Long fromHour (UnitTime unit, LocalTime time) {
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int millisecond = time.getNano();
		
		switch (unit) {
		case HOURS:
			return (long) hour;
		case MINUTES:
			return  hour*(60L)+minute;
		case SECONDS:
			return second + hour*(60L*60L)+ minute*(60L);
		case MILLISECONS:
			return (millisecond*(1000000L)) + (second *(1000L)) + (hour*(60L*60L*1000L)) + (minute*(60L * 1000L));
		default:
			throw new UnsupportedOperationException();
				
		}
		
	}

}
