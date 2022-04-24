package jdbc_check;
import java.sql.*;
public class Test_On_Data {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anand_practise","root","root");
		
		Statement sat=con.createStatement();
		//5. Ascending order by Name : ResultSet set=sat.executeQuery("select * from new_table order by Name");
//		5. Ascending order by City : ResultSet set=sat.executeQuery("select * from new_table order by City");
	// 5.Ascending order by City :	ResultSet set=sat.executeQuery("select * from new_table order by County");
		
	// 3& 4.	ResultSet set=sat.executeQuery("select * from new_table where name="+setName("Raju"));
		ResultSet set=sat.executeQuery("select * from new_table order by County");
		while(set.next()) {
			String name=set.getString("Name");
			String age=set.getString("Age");
			String gender=set.getString("Gender");
			String city=set.getString("City");
			String county=set.getString("County");
			String mobile=set.getString("Mobile");
			System.out.println(name+"| "+age+" |"+gender+"| "+city+"| "+county+"| "+mobile);
		}
		sat.close();
		con.close();
	}
	public static String setName(String name) {
		return "'"+name+"'";
	}

}
