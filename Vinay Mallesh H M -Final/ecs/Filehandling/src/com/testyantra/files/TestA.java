package com.testyantra.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestA {
	public static void main(String[] args) {
		 String mesg = "Hi how are you doing...?";
		 
		 byte[] by = mesg.getBytes();
		 
		 try {
			FileOutputStream fout = new FileOutputStream("Dimple.txt");
			fout.write(by);
			System.out.println("Done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
