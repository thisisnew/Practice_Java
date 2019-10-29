package com.thisisnew.reflection;

public class ReflectionTest {
	
	private String name;
	private String gender;
	private Tool use;
	
	public enum Tool{
		INTELLIJ, ECLIPSE;
	}
	
	public ReflectionTest() {
		
	}
	
	private ReflectionTest(Tool use) { //private
		setUse(use);
		System.out.println("Tool : " + getUse());
	}
	
	private void setNameAndUse(String name, Tool use) { //private
		setName(name);
		setUse(use);
	}
	
	public Tool getUse() {
		return use;
	}

	public void setUse(Tool use) {
		this.use = use;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}	
}
