package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public long price;
	public boolean madeInUSA;
	public char grade;

	public Computer() {
		System.out.println("This is from default Constructor of Computer Class.");

	}

	public Computer(String brand, String model, String operatingSystem,long price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA =madeInUSA;

		System.out.println("My Brand:" + brand + ", Model: " + model + ", Operating System: " + operatingSystem
				+ ". Price: " + price + "$, Grade: " + grade + ". Made In USA? Ans:" + madeInUSA);

	}

	}

