package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This is from the default constructor of the Father class.");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My Father's name is: " + name + ".His age is " + age + ". Sex: " + sex
				+ ". Is Father UScitizen? Ans: " + usCitizen);
	}

	public void father() {
		System.out.println("This is from the void method of the Father class.");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My Father's name is: " + name + ". His age is " + age + ". Sex: " + sex
				+ ". Is Father UScitizen? Ans: " + usCitizen);
	}

}
