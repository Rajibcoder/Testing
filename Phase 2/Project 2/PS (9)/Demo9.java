package com.simplilearn.JunitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Demo9 {
	
	@ParameterizedTest
	@CsvSource({"test,TEST","monDAy,Monday","July,july"})
	public void test1(String Actual,String Expected) {
		String ActualValue = Actual.toLowerCase();
		String ExpectedValue = Expected.toLowerCase();
		
		assertEquals(ActualValue,ExpectedValue);
	}

}
