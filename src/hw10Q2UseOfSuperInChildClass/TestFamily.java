package hw10Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		Daughter daughter = new Daughter();
		Daughter daughter1 = new Daughter("February", 2);
		daughter1.daughter();
		daughter1.daughterInfo("November", 28);
		Father father1 = new Father();
		Father father2 = new Father("Baba", 60, 'M', false);
		father1.father();
		father1.fatherInfo("Baba", 60, 'M', true);

	}

}
