package jdbc_check;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Checking_2 {
	
	public static void main(String[] args)throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anand_practise","root","root");
		Statement set=con.createStatement();
//		ResultSet val=st.executeQuery("insert into anna(id,name) values(4,'Nune')");
//		while(val.next()) {
//			int id=val.getInt("id");
//			String name=val.getString("name");
//			System.out.println(id+" "+name);
//		}
		ResultSet res=set.executeQuery("select * from anna");
		while(res.next()) {
			int id=res.getInt("id");
			String name=res.getString("name");
			System.out.println(id+" "+name);
		}
		set.close();
		con.close();
	}
}
