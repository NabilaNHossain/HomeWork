package hw3Q2JavaVariables;


public class AboutMe {
	
		
	
	public byte houseNumber;
//In the line above the variable is declared and not initialized//
	public String name = "Nabila";
	public byte age = 100;
	public short attendedDaysInEnthrallIt = 235;
//In the line above the variable is initialized //
	public int lotNumber = 432690;
	public long carNumber = 3958l;
	public float height = 1.0796f;
	public double weight = 3.141592653589793;
	public char sex = 'F';
	public boolean workInItIndustry = true;

	public AboutMe() {
		System.out.println("This is a test run.");
	}

	public void aboutMe() {
		System.out.println("My name is "+name);
	}
	public static void main(String[] args) {
		AboutMe me = new AboutMe();
		me.aboutMe();

		
	 
		
		
		
	}
		
		

}
