package com.testyanrea.exception.test;

import java.io.File;
import java.io.IOException;

public class TestG {
	public static void main(String[] args) {
		
		System.out.println("main started ");
		
		
		File f = new File("vinay.txt");
		try
		{
			f.createNewFile();
			System.out.println("file cteated");
		} 
		catch (IOException e) 
		{
			System.out.println("sorry could not create the file");
		}
		
		System.out.println("main ended ");
	}

}
