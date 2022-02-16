package hw11Q2Polymorphism;

public class Sister {
	/*
	 * Method Overloading happens when different methods exists in a class with the
	 * same method name but with different parameters or signature. Method
	 * Overloading occurs at compile time
	 */
	public void sister() {
		System.out.println("This is from the void method of Sister class.");
	}

	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("The total from total1 is: " + total1);
	}

	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("The total from total2 is: " + total2);
		return total2;
	}

	public int sister(int age1, int age2, int age3, int age4) {
		int total3 = age1 + age2 + age3 + age4;
		System.out.println("The total from total3 is: " + total3);
		return total3;
	}

	public int sister(int age1, int age2, String age4) {
		int total4 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("The total from total4 is: " + total4);
		return total4;
	}

	public final int sister(int age5, String age4, int age6) {
		int total5 = age5 + Integer.parseInt(age4) + age6;
		System.out.println("This total from total5 is: " + total5);
		return total5;
	}

	public static int sister(int age1, int age2, int age3, int age5, int age6) {
		int total6 = age1 + age2 + age3 + age5 + age6;
		System.out.println("The total from total6 is:  " + total6);
		return total6;
	}
}