package com.simplilearn.JunitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Demo4 {
	
	@Test
	public void test1() {
		//assertTrue("abc".contains("z"));
		Assumptions.assumeTrue("abc".contains("z"));
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		Assumptions.assumingThat("abc".contains("z"), ()->{
			System.out.println("friday");
		});
	}

}
