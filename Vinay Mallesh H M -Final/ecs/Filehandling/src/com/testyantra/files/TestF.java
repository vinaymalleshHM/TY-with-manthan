package com.testyantra.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestF {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("myDBConfig.properties");
			
			Properties pr = new Properties();
			pr.load(fin);
			
			String user  = pr.getProperty("User");
			String url = pr.getProperty("Url");
			
			System.out.println("User is "+user);
			System.out.println("URL is "+url);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
