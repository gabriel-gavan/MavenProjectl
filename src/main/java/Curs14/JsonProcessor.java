package Curs14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonProcessor {
	public void writeJson() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "TestUser");
		obj.put("email", "Test@test.comr");
		JSONArray list = new JSONArray();
		list.add("Obiect1");
		list.add("Obiect2");
		list.add("Obiect3");
		list.add("Obiect4");
		list.add("Obiect5");
		obj.put("listaobiecte", list);
		
		try(FileWriter file = new FileWriter("test.json")){
			file.write(obj.toJSONString());
		
	}catch (IOException e) {
		e.printStackTrace();
	}
}
	public void readJson(String key) {
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader("test.Json");
			JSONObject jsonobj = (JSONObject) parser.parse(reader);
			System.out.println(jsonobj);
			String obiect = (String) jsonobj.get(key);
			System.out.println("key: " + obiect);
		} catch (Exception e) {
			
		}
	}
}
