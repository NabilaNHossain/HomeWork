package hw5Q3Constructor;

public class Student {

	public String stName;
	public int stID;
	public char sex;
	public float grade;
	public boolean isProgrammer;

	public Student() {
		System.out.println("This is from default Constructor of Student class.");
	}

	public Student(String stName, int stID, char sex, float grade, boolean isProgrammer) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("Student Name:" + stName + ", ID:" + stID + ", Sex:" + sex + ", Grade=" + grade
				+ " and Java Programmer? Ans:" + isProgrammer + ".");

	}

}