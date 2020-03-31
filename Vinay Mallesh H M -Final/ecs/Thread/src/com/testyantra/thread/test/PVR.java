package com.testyantra.thread.test;

public class PVR {

	synchronized void  confirm() {
		for (int i = 0; i < 5; i++) {

			try 
			{
				if(2==i)
				{
				wait();//wait(1);
				}
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		
	}

	synchronized void leaveme() 
	{
		System.out.println("lllllll");
		notify();
		
	}

}
