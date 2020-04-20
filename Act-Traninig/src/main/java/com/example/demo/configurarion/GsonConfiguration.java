package com.example.demo.configurarion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.serialization.HourAdapter;
import com.example.demo.serialization.IntegerSerializableAdapter;
import com.example.demo.serialization.MinuteAdapter;
import com.example.demo.serialization.SecondAdapter;
import com.example.demo.time.domain.Hour;
import com.example.demo.time.domain.Minute;
import com.example.demo.time.domain.Second;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Configuration
public class GsonConfiguration {
	@Bean
	public Gson gson() {
		return new GsonBuilder()
				.registerTypeAdapter(Hour.class, new IntegerSerializableAdapter<>(Hour::of))
				.registerTypeAdapter(Minute.class,new IntegerSerializableAdapter<>(Minute::of))
				.registerTypeAdapter(Second.class, new IntegerSerializableAdapter<>(Second::of))
				.create();
	}
	/*public Gson gson() {
		return new GsonBuilder()
				.registerTypeAdapter(Hour.class, new HourAdapter())
				.registerTypeAdapter(Minute.class,new MinuteAdapter())
				.registerTypeAdapter(Second.class, new SecondAdapter())
				.create();
	}*/
	
	

}
