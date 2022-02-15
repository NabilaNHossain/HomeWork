package hw9Q2Encapsulation;

public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;

	public String getName() {
		return name;
	}

	/*
	 * We can access the private variables by Getters and Setters. We can access the
	 * Getters and Setters two ways: 1)Source-->Generate Getters and Setters
	 * or, 2)select all the declared variables-->right click-->Source-->Generate
	 * Getters and Setters
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}
