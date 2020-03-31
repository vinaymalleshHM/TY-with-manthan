package com.testyantra.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FilterTest {


	@Test
	void testFilter() {
		DBUtil db = mock(DBUtil.class);

		Filter f = new Filter(db);

		when(db.getNames()).thenReturn(Arrays.asList("Amith","Priya","Bhanu","Arpitha"));
		List<String> myList = f.myFilter();
		assertEquals(2, myList.size());
	}
}
