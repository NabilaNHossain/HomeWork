package hw11Q2Polymorphism;

/*When different methods exist with the same name and same parameters or signature, but the logic or syntax is different it's called Overriding.Method Overriding occurs during run time. */
public class Niece extends Sister {
	@Override
	public void sister() {
		System.out.println("This is from the void method of Niece class.");
	}

	@Override
	public void sister(int age1, int age2) {
		int total1 = 1 + age1 + age2;
		System.out.println("The total from total1 is: " + total1);
	}

	@Override
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3 * 2;
		System.out.println("The total from total2 is: " + total2);
		return total2;
	}

	@Override
	public int sister(int age1, int age2, int age3, int age4) {
		int total3 = age1 * 2 + age2 + age3 + age4 * 3;
		System.out.println("The total from total3 is: " + total3);
		return total3;
	}

	@Override
	public int sister(int age1, int age2, String age4) {
		int total4 = age1 - 3 + age2 + Integer.parseInt(age4);
		System.out.println("The total from total4 is: " + total4);
		return total4;
	}

	/*
	 * final type method cannot be overridden as it is a method which cannot be
	 * modified by a Child class.Only the Parent class that it belongs to, can
	 * modify it.
	 * 
	 * @Override public final int sister(int age5, String age4, int age6) { int
	 * total5 = age5 + Integer.parseInt(age4) + age6;
	 * System.out.println("This total from total5 is: " + total5); return total5; }
	 */

	/*
	 * A Static method cannot be overridden as it is a local method of the Parent
	 * class.But if we remove the Override annotation it can be executed as a static
	 * method of this class.
	 * 
	 * @Override public static int sister(int age1, int age2, int age3, int age5,
	 * int age6) { int total6 = age1 + age2 + age3 + age5 + age6;
	 * System.out.println("The total from total6 is:  " + total6); return total6; }
	 */

	public static int sister(int age1, int age2, int age3, int age5, int age6) {
		int total8 = age1 + age2 + age3 + age5 + age6 + 10;
		System.out.println("This is from the Static method of Niece class.The total is: " + total8);
		return total8;
	}
}
