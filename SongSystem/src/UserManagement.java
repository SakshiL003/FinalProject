import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserManagement {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

			//step 1-load the jdbc driver class
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 Establish the connection
			String url="jdbc:mysql://localhost:3306/music";
			String uname="root";
			String password="root";
			
			//Step 3-connect with database
			
			Connection conn=DriverManager.getConnection(url,uname,password);
		//step 4-inserting record using preparedstatement()
			
			String sql="insert into songs(sname,stype,duration)values(?,?,?)";
			
			/*PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setInt(1, 102);
			ps.setString(2, "sayli");
			ps.setString(3,"pune");*/
			
			//int i=ps.executeUpdate();
			
			CallableStatement cs=(CallableStatement) conn.prepareCall(sql);
			
			
			cs.setString(1, "Tera fitoor");
			cs.setString(2, "Silent");
			cs.setDouble(3, 3);
			cs.execute();
			
			System.out.println("Data inserted successfully");
		}

	}

	

