package Student;

import java.sql.*;

public class StudentInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "4399";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "INSERT INTO student (stud_no, stud_name, stud_DOB, stud_DOJ) VALUES (?, ?, ?, ?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "1");
			statement.setString(2, "Ankit");
			statement.setString(3, "17/05/1999");
			statement.setString(4, "10/02/2022");
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new record was inserted successfully!");
			}

			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
       }


	

}
