package com.telusko.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	
	//final static  url = "jdbc:h2:~/h23/test";
	final static String url = "jdbc:h2:tcp://localhost//C:\\Users\\DELL\\h23\\test";
	final static String user = "sa";
	final static String password = "sa";
	final static String sql = "SELECT * FROM CREDENTIAL  where username= ? and password = ?";
	
	public boolean check(String userName, String password) throws ClassNotFoundException, SQLException {			
		
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection(url, user, this.password);
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, userName);
		pt.setString(2, password);
		ResultSet rs = pt.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}
}
