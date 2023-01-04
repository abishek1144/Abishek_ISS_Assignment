package JavaCodes;

import java.io.FileReader;

/*
 https://code.google.com/archive/p/json-simple/downloads
 */
import org.json.simple.*;
import org.json.simple.parser.*;


public class JSONReader {
	
	public JSONObject getJSONFileObject(String filepath) {
		
		try {     
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(filepath));
            return  (JSONObject) obj;
        
        }catch(Exception e) {
        	e.printStackTrace();
        	
        }
		return null;
		
	}
    
    public static void main(String[] args) {
    	
    	JSONReader reader = new JSONReader();
    	JSONObject json = reader.getJSONFileObject("C:\\Users\\HP\\eclipse-workspace\\JavaCodes\\src\\JavaCodes\\sample_json_file.json");
    	System.out.println(json);
    	System.out.println(json.getOrDefault("quiz", "Key Not Found"));
    	
    }

}
