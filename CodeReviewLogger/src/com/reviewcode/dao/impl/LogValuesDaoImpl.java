package com.reviewcode.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;
import com.reviewcode.dao.LogValuesDao;

public class LogValuesDaoImpl implements LogValuesDao{
	
	Connection connection = null;

	public LogValuesDaoImpl(Map<?,?> dbParams) {
		
		Properties connectionProps = new Properties();
		connectionProps.put("user", dbParams.get("userName"));
		connectionProps.put("password", dbParams.get("password"));

		try {
			connection = DriverManager.getConnection("jdbc:" + dbParams.get("dbms") + "://" + dbParams.get("serverName")
					+ ":" + dbParams.get("portNumber") + "/", connectionProps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertLogValues(boolean message, int logType) {
		
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.executeUpdate("insert into Log_Values('" + message + "', " + String.valueOf(logType) + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
