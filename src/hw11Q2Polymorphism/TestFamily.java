package hw11Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("This is from Sister class.");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(20, 30);
		sister.sister(10, 20, 30);
		sister.sister(35, 25, 15, 5);
		sister.sister(20, 30, "47");
		sister.sister(45, "70", 33);
		Sister.sister(45, 11, 33, 65, 22);

		System.out.println("\n-------This is from Niece class------\n");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(20, 30);
		niece.sister(10, 20, 30);
		niece.sister(35, 25, 15, 5);
		niece.sister(20, 30, "47");
	}

}
