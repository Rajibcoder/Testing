package exceptionhandling;

import java.io.FileOutputStream;

public class TryParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream obj =new FileOutputStream("result.txt")){      
			String msg = "Welcome to java!";      
			byte byteArray[] = msg.getBytes();       
			obj.write(byteArray);  
			System.out.println("Message written to file successfuly!");      
			}
		catch(Exception e){  
			       System.out.println(e);  
			}      
		
	}

}
