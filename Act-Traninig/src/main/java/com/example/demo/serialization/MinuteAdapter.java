package com.example.demo.serialization;

import java.lang.reflect.Type;

import com.example.demo.time.domain.Minute;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class MinuteAdapter implements JsonSerializer<Minute>, JsonDeserializer<Minute>{

	@Override
	public JsonElement serialize(Minute src, Type typeOfSrc, JsonSerializationContext context) {
		Integer value = src.getValue();
		return  new JsonPrimitive(value);
	}

	@Override
	public Minute deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		Integer value = json.getAsInt();
		return  Minute.of(value);
	}

}
