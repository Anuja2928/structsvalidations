package com.bv.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bv.connection.DBConnect;

public class LoginService {
	public static boolean validateUser(String username, String password)
	{
		boolean status = false;
		String sql = "select username,password from anuja where username = ? and password = ?";
		Connection con = DBConnect.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next())
		status = true;
	

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
}
