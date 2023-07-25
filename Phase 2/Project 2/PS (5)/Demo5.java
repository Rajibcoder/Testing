package com.simplilearn.JunitDemo;

public interface Demo5 {

	public void day();

	public default void month() {
		System.out.println("july");
	}
	

}
