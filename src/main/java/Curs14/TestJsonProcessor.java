package Curs14;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class TestJsonProcessor {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		
			JsonProcessor  obj = new JsonProcessor();
			obj.writeJson();
			obj.readJson("email");
			obj.updateJsonFile("email", "altemail@altemail.com");
			obj.readJson("email");
			obj.readJson("name");
			obj.deleteFromJsonFile("name");
			obj.readJson("name");
	}

}
/*
 * git init -> creaza un repo. rulam o singura data
 * ccream fisier .gitignore
 * 
 * git add. --> adauga tot (git add file ....)
 * 
 * git commit -m  "mesaj"
 * 
 * git remote add origin https://github.com/gabriel-gavan/MavenProjectl.git
 * 
 *  git pull
 *  
 *  git push origin master
 * 
 * 
 * 
 */

