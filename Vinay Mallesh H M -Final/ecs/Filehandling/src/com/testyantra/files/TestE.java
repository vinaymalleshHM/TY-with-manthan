package com.testyantra.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestE {
	public static void main(String[] args) {
		
		Properties pr = new Properties();
		
		
		pr.setProperty("drivername", "com.mysql.jdbc.Driver");
		pr.setProperty("Url", "jdbc:mysql://localhost:3306");
		pr.setProperty("User", "root");
		pr.setProperty("Password", "root");
		
		
		try {
			FileOutputStream fout = new FileOutputStream("myDBConfig.properties");
			
			pr.store(fout, "Storing Data");
			System.out.println("Done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
