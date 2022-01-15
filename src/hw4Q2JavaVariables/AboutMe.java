package hw4Q2JavaVariables;

public class AboutMe {
	// VARIABLES ARE DECLARED IN HERE//
	public String name;
	public byte age;
	public short attendedDaysInEnthrallIt;
	public int houseNumber;
	public long carNumber;
	public float height;
	public double weight;
	public char sex;
	public boolean workInTheItIndustry;

//CONSTRUCTOR IS DECLARED IN HERE//
	public AboutMe() {
		System.out.println("This is all about me. ");
	}

//METHOD IS IMPLEMENTED HERE//
	public void aboutMe() {
		System.out.println(
				"Hi,my name is: " + name + " .I am " + age + " years old.\nI have been a student at EnthrallIT for "
						+ attendedDaysInEnthrallIt + "days" + "\nI live at " + houseNumber + " number home in Texas."
						+ "\nMy car number is: " + carNumber + " .\nI am " + height + " Ft .\nI weigh " + weight
						+ "lbs " + "\nI work in the IT industry: " + workInTheItIndustry + " .");

	}

	public static void main(String[] args) {
		AboutMe me = new AboutMe();
		me.aboutMe();

	}

}
