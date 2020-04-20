package com.example.demo.common;

import java.util.Objects;

public class precondition {
	
	public static void checkNotNull(Object reference) {
		if(Objects.isNull(reference)) {
			throw new NullPointerException();
		}
	}
	
	public static void checkArgument(boolean argument) {
		if(!argument) {
			throw new IllegalArgumentException();
		}
	}

}
