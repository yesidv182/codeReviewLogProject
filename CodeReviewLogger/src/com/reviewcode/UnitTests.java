package com.reviewcode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class UnitTests {

	@Test
	public void logFileError() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(true, false, false, false, false, true, dbParamsMap);
			jobLogger.logMessage("Exito file error", false, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void logFileWarning() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(true, false, false, false, true, false, dbParamsMap);
			jobLogger.logMessage("Exito file warning", false, true, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void logFileMessage() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(true, false, false, true, false, false, dbParamsMap);
			jobLogger.logMessage("Exito file message", true, false, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void logConsoleError() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(false, true, false, false, false, true, dbParamsMap);
			jobLogger.logMessage("Exito console error", true, false, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void logConsoleWarning() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(false, true, false, false, true, false, dbParamsMap);
			jobLogger.logMessage("Exito console warning", false, true, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void logConsoleMessage() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(false, true, false, true, false, false, dbParamsMap);
			jobLogger.logMessage("Exito console message", true, false, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void logDbError() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(false, false, true, false, false, true, dbParamsMap);
			jobLogger.logMessage("Exito db error", false, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void logDbWarning() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(false, false, true, false, true, false, dbParamsMap);
			jobLogger.logMessage("Exito db warning", false, true, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void logDbMessage() {
		try {
			Map<String, String> dbParamsMap = new HashMap<String, String>();
			dbParamsMap.put("logFileFolder", "/Users/yesidvargas/logger/");
			dbParamsMap.put("userName", "test");
			dbParamsMap.put("password", "test123");
			dbParamsMap.put("dbms", "dbms");
			dbParamsMap.put("serverName", "localhost");
			dbParamsMap.put("portNumber", "9443");
			
			JobLogger jobLogger = new JobLogger(false, false, true, true, false, false, dbParamsMap);
			jobLogger.logMessage("Exito db message", true, false, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
