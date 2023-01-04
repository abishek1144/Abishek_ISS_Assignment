package JavaCodes;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class file_read_write {
	static public void writeToFile(String file, String message) {

		try {
			//Open given file. If not present, create a new file.
            FileWriter writer = new java.io.FileWriter(file, true);
            System.out.println("File created or old file will be appended!");
            //Create a buffer writer to write inside the file.
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            //On a new line, write the given message.
            bufferedWriter.newLine();
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.write("Closing the file now.");
            
            //Close the writer file after writing.
            bufferedWriter.close();
	    
        } 
		//If error occurs print it.
		catch (IOException e) {
	    	e.printStackTrace();
	        }
		
	}
	
	static public void readFile(String file) {
		//Open the said file from filepath
		try (FileReader reader = new FileReader(file)) {
		    int character;
		    //Read over each character format  he file.
		    while ((character = reader.read()) != -1) {
		    	//Print the characters.
		        System.out.print((char) character);
		    }
		} 
		//If exception occurs, print it.
		catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filepath = "C:\\Users\\HP\\eclipse-workspace\\JavaCodes\\src\\JavaCodes\\text_file.txt";
		
		file_read_write.writeToFile(filepath, "Hello all !! This is Abishek S from ISS Governance");
		file_read_write.readFile(filepath);
		
		

	}

}
