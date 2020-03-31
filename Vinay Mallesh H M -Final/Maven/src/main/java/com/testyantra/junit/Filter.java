package com.testyantra.junit;

import java.util.ArrayList;
import java.util.List;


public class Filter {

	private DBUtil dbUtil;

	public Filter(DBUtil dbUtil ) {

		this.dbUtil=dbUtil;
	}



	public List<String> myFilter(){
		List<String> newList = new ArrayList<String>();
		List<String>  formDB = dbUtil.getNames();


		for (String name : formDB) {

			if (name.startsWith("A")) {

				newList.add(name);
			}

		}
		return newList;



	}
}