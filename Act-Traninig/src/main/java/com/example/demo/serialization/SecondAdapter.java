package com.example.demo.serialization;

import java.lang.reflect.Type;

import com.example.demo.time.domain.Second;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class SecondAdapter implements JsonSerializer<Second>, JsonDeserializer<Second>{

	@Override
	public Second deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		Integer value = json.getAsInt();
		return  Second.of(value);
	}

	@Override
	public JsonElement serialize(Second src, Type typeOfSrc, JsonSerializationContext context) {
		Integer value = src.getValue();
		return  new JsonPrimitive(value);
	}

}
