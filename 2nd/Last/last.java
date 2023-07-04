package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class last {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int id = 0;
		try {
			System.out.println("Enter the ID no :");
			id = sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Enter only integer value");
		}
		finally {
			sc.close();
		}
		String dburl = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String password = "root";
		String query = "select * from products where product_id = "+id;
		Connection con = null;

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dburl,username,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			if(rs.next())
			{
				System.out.print(rs.getString("product_id")+"\t");
				System.out.print(rs.getString("product_name")+"\t");
				System.out.println(rs.getString("product_price")+"\t");
				
			}
			else {
            throw new Exception("Invalid product ID. Please enter a correct product ID.");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			con.close();
		}

	}

}
