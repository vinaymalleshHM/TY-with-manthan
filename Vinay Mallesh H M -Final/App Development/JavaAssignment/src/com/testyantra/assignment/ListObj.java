package com.testyantra.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObj {

	List objList(String s) {
		List c = null;
		if (s.equalsIgnoreCase("A")) {
			System.out.println("ArrayList");
			c = new ArrayList();
			c.add('f');
			c.add("Dimple");
			c.add(4545);
		}
		else if (s.equalsIgnoreCase("L")) {
			System.out.println("LinkedList");
			c = new LinkedList();
			c.add('f');
			c.add("Dimple");
			c.add(4545);
		}
		else if (s.equalsIgnoreCase("V")) {
			c = new Vector();
			System.out.println("Vector");
			c.add('f');
			c.add("Dimple");
			c.add(4545);
		}
		else {
			System.out.println("Inavlid input");
		}

		return c;

	}

}
