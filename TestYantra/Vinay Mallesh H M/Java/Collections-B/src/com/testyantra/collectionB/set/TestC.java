package com.testyantra.collectionB.set;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;

public class TestC {

	public static void main(String[] args) {
		Collection<Double> al = new ArrayList<Double>();
		al.add(25.36);
		al.add(53.36);
		al.add(36.36);
		al.add(52.36);
		
		for (Double double1 : al) {
			System.out.println(double1);
		}
	}

}
