package com.testyantra.collectionB.map.test;

public class TestJ {
	
	public static void main(String[] args) {
		
		Fcactorial ref=a->{
			int num=1;
			for (int i = a; i> 0 ; i--) {
			
			 num=i*num;
			 
		}
			return num;
		};
		
	int n =ref.fact(5); 
	System.out.println(n);
	}

}
