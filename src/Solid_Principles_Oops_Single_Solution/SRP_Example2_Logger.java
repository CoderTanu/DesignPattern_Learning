package Solid_Principles_Oops_Single_Solution;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



//have only one reason to change that means this class only used for adding logger if we want to create other functionlaity for logger tha need to be in separted class
public class SRP_Example2_Logger {
	
	private String path;
	
	SRP_Example2_Logger (String path) throws IOException {
		File file = new File(path);
		if(!file.exists()) {
			file.createNewFile();
		}
		
		this.path = path;
	}
	
	
	//create the logger 	
	public void log(String message) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			bw.write(message);
			bw.newLine();
		}catch(Exception e) {
			
			System.out.println("Failed to log this msg" + message);
		}
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		//String path = "\"C:\\\\Users\\\\ASUS\\\\Desktop\\logger.txt\";"
		String path = "";
		SRP_Example2_Logger SRP_Example2_Logger = new SRP_Example2_Logger("C:\\Users\\ASUS\\Desktop\\logger.txt");
		SRP_Example2_Logger.log("Please log1");
		SRP_Example2_Logger.log("Please log2");
		SRP_Example2_Logger.log("Please log3");
		SRP_Example2_Logger.log("Please log4");

	}

}
