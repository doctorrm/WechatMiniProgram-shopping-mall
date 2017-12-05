package org.yi.util;

import java.io.IOException;

import com.fasterxml.jackson.core.sym.Name;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DbUtil {
	public static void main(String[] args) throws IOException {
		String json = "{\"name\":\"mkyong\",\"salary\":7500,\"skills\":[\"java\",\"python\"]}";
		ObjectMapper mapper=new ObjectMapper();
		JsonNode node=mapper.readTree(json);
		System.out.println(node.get("skills"));
	}
}
