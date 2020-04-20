package com.example.demo.time.domain;

import com.example.demo.common.precondition;
import com.example.demo.serialization.IntegerSerializable;

import lombok.Value;


@Value(staticConstructor = "of")
public class Hour implements IntegerSerializable {
	
	Integer value;
	
	
	/*
	 * of=> para una sola variable
	 * from => para mas de una variable 
	 *
	public static Hour of(Integer value) {
		return new Hour(value);
		
	}
	
	private final Integer value;
	 */
	
	private  Hour(Integer value) {
		precondition.checkNotNull(value);
		precondition.checkArgument(value >= 0 && value <=23);
		this.value = value;
	}
	@Override
	public Integer valueOf() {
		return value;
	}

}
