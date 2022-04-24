package jdbc_check;
import java.sql.*;
public class JDBC_Conncetion {
	
	public static void main(String[]args) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anand_practise","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from anna");
		while(rs.next()) {
		int id=rs.getInt("id");
		String name=rs.getString("name");
		System.out.println(id+" "+name+" ");
		}
		st.close();
		con.close();
	}
}
