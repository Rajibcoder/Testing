package com.simplilearn.JunitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags("production")
public class Demo13 {
	
	@Test
	@Tag("devlopment")
	@Tag("production")
	public void Test1() {
		System.out.println("a");
	}
	
	@Test
	@Tag("production")
	public void Test2() {
		System.out.println("b");
	}
	
	@Test
	@Tag("devlopment")
	public void Test3() {
		System.out.println("c");
	}
}
