package com.simplilearn.JunitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class Demo6 {
	
	@RepeatedTest(5)
	public void test1() {
		System.out.println("Hello");
	}
	
	@RepeatedTest(value = 5,name = "{displayName}{currentRepetition}/{totalRepetitions}")
	@DisplayName("Execution")
	public void test2(TestInfo testinfo) {
		System.out.println(testinfo.getDisplayName());
	}
	
	@RepeatedTest(5)
	public void test3(RepetitionInfo repeatitioninfo) {
		System.out.println("current Test Count "+repeatitioninfo.getCurrentRepetition());
	}

}
