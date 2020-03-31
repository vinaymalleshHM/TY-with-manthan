package com.testyantra.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestD {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fin = new FileInputStream("Dimple.txt");
			int m;
			while((m = fin.read()) !=-1) {
				System.out.print((char)m);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
  			e.printStackTrace();
		}
	}

}
