package seleniumpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbceaxample {

	public static void main(String[] args) throws SQLException {
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root" ,"password");
		Statement st=con.createStatement();
		
		//CREATING A TABLE 
//		String q="CREATE TABLE IF NOT EXISTS employees ("
//                + "id INT AUTO_INCREMENT PRIMARY KEY, "
//                + "name VARCHAR(50), "
//                + "position VARCHAR(50), "
//                + "salary DOUBLE)";
//		st.execute(q);
//		System.out.println("TABLE CREATED");
		
		
		//INSERTING DATA
//		String q="INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";
//		PreparedStatement ps= con.prepareStatement(q);
//		ps.setString(1, "Alice");
//        ps.setString(2, "Developer");
//        ps.setDouble(3, 75000);
//        ps.executeUpdate();
//        
//        ps.setString(1, "Bob");
//        ps.setString(2, "Manager");
//        ps.setDouble(3, 85000);
//        ps.executeUpdate();
//        System.out.println("INSERTED SUCCESSFULLY");
		
		//UPDATING DATA
//		String q="UPDATE employees SET salary =20000 WHERE name = 'Bob' ";
//		st.executeUpdate(q);
//		System.out.println("UPDATED  SUCCESSFULLY");
		
		//DELETING DATA
//		String q="DELETE FROM employees WHERE id = 2";
//		st.executeUpdate(q);
//		System.out.println("DELETED SUCCESSFULLY");
		
		 String selectSQL = "SELECT * FROM employees";
		 ResultSet rs=st.executeQuery(selectSQL);
		 while (rs.next()) {
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			 
			 
		 }
		
        
        

	}

}
