package com.testyantra.collectionB.set;

import java.util.PriorityQueue;

public class TestB {
	public static void main(String[] args) {
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		pq.add(25.36);
		pq.add(53.36);
		pq.add(36.36);
		pq.add(52.36);
		
		
		for (Double double1 : pq) {
			
			System.out.println(double1);
			
		}
	}

}
