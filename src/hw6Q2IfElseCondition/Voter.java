package hw6Q2IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		int age = 33;
		int age1 = 18;
		if (age == age1) {
			System.out.println("I am a Voter");
		} else if (age < age1) {
			System.out.println("I am not a Voter");
		} else if (age >= age1) {
			System.out.println("I am a Voter");
		} else {
			System.out.println("Please add a valid age");
		}

	}

}
