package com.testyanrea.exception.test;

public class ATMSimulator {
	
	void verify(int amt) {
		if(amt>40000)
		{
			//DayLimitException x = new DayLimitException("plz withdraw below 40k");
			DayLimitException x = new DayLimitException();
			throw x;
		}
	}

}
