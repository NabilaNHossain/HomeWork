package hw10Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n----------Default constructor initialized for Daughter class------");
		Daughter daughter = new Daughter();
		System.out.println("\n----------Parameterized type constructor initialized for Daughter class------");
		Daughter daughter1 = new Daughter("February", 2);
		System.out.println("\n----------Default type method initialized for Daughter class------");
		daughter1.daughter();
		System.out.println("\n----------Parameterized type method is initialized from Daughter class------");
		daughter1.daughterInfo("November", 28);
		System.out.println("\n----------Default constructor initialized for Father class------");
		Father father1 = new Father();
		System.out.println("\n----------Parameterized type constructor initialized for Father class------");
		Father father2 = new Father("Baba", 60, 'M', false);
		System.out.println("\n----------Default type method initialized for Father class------");
		father1.father();
		System.out.println("\n----------Parameterized type method initialized for Father class------");
		father1.fatherInfo("Albus", 60, 'M', true);

	}

}
