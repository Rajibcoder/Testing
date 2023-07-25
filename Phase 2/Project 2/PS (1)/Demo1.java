package com.simplilearn.JunitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Demo1 {
	
	@BeforeAll
	public static void setUp() {
		System.out.println("Hello");
	}
	
	@Test
	public void test1() {
		System.out.println("Test");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("by");
	}
}
