package com.example.demo.time.domain;

import com.example.demo.common.precondition;
import com.example.demo.serialization.IntegerSerializable;

import lombok.Value;

@Value(staticConstructor = "of")
public class Second implements IntegerSerializable {
	Integer value;

	public Second(Integer value) {
		precondition.checkNotNull(value);
		precondition.checkArgument(value >= 0 && value <=59);
		this.value = value;
	}
	
	@Override
	public Integer valueOf() {
		return value;
	}
	

}
