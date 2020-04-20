package com.example.demo.time.domain;

import lombok.Value;

@Value
public class HourDay {
	Hour hour;
	Minute minute;
	Second second;
	Integer HoraDia;
	
	public static HourDay from(Hour hour, Minute minute, Second second, Integer horadia) {
		
		return new HourDay(hour,minute,second,horadia);
	}

	

	
	

}
