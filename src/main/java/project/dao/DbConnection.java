package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import project.exception.DbExcception;


public class DbConnection {
	private static final String SCHEMA = "poject";
	private static final String USER = "poject";
	private static final String PASSWORD = "poject";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;
	
	public static Connection getConnection() { 
		String url =
				String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",
						HOST, PORT,SCHEMA, USER, PASSWORD);
		System.out.println("Connection to url= "+url);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Succesfully obteined connection!");
			return conn;
				
		}
		catch (SQLException e) {
			throw  new DbExcception(e);
			
		}
	
}
}
