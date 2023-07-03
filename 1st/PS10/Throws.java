package collectionframework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Throws {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Rajib\\Documents\\result.txt");
		PrintWriter obj = new PrintWriter(file);
		obj.print("Hello World v");
		obj.close();
	}

}
