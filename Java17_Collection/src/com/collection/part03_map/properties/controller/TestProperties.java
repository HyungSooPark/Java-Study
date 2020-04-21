package com.collection.part03_map.properties.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public void testProp() {
		//설정 파일의 값을 읽어서 적용할때 사용된다.
		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		prop.setProperty("user", "KH");
		prop.setProperty("password", "KH");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.properties"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "JDBC DRIVER");
			prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc DRIVER");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testProp2() {
		//파일에서 읽어와 Properties에 저장
		Properties prop = new Properties();
		
		try {
			//prop.load(new FileInputStream("driver.properties"));
			//prop.load(new FileInputStream("driver.txt"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
