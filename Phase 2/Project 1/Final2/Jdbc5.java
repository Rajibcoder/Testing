package jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc5 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String dburl = "jdbc:mysql://localhost:3306/ecommerce";	//connection string
		String username = "root";
		String password = "root";
		String query = "select product_type,count(*)as similer_products from products group by product_type;";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		//register the jdbc driver		
			con = DriverManager.getConnection(dburl,username,password);		//connecting to DB
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("Product Type         | Similer Products");
            System.out.println("---------------------+-----------------");
			
			while(rs.next())
			{
				String type = rs.getString("product_type");
				int count = rs.getInt("similer_products");
				System.out.printf("%-20s | %d%n", type, count);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
