package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo("Baba", 60, 'M', false);
		super.familyName="Hossain";
		System.out.println("The family name is:"+ familyName);
		System.out.println("This is from the default constructor of the Daughter class");
	}

	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("My daughter is born in " + birthMonth + ". Her age is " + age);
	}

	public void daughter() {
		System.out.println("This is from the void method of the Daughter class");
	}

	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("My daughter is born in " + birthMonth + ". Her age is " + age);
	}

}
