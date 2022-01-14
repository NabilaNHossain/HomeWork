package hw4Q2JavaVariables;

public class TestAboutMe {
	public static void main(String[]args) {
		AboutMe me = new AboutMe();//CONSTRUCTOR IS INITIALIZED HERE WHEN THE OBJECT CREATED//
		
		//VARIABLES ARE INITIALIZED IN HERE //
		me.name= "Nabila";
		me.age=127;
		me.attendedDaysInEnthrallIt =23;
		me.houseNumber = 4567;
		me.carNumber =1256l;
		me.height = 5.4f;
		me.weight = 5.6524;
		me.sex = 'f';
		me.workInTheItIndustry = true;
		
		me.aboutMe();//METHOD IS INITIALIZED/CALLED BY THE OBJECT CREATED//
		
		System.out.println("--------------------------------");
		
		
		AboutMe me3 = new AboutMe();
		
		me3.name= "Alex";
		me3.age=14;
		me3.attendedDaysInEnthrallIt= 7;
		me3.houseNumber = 365;
		me3.carNumber = 7896l;
		me3.height = 5.24f;
		me3.weight = 94.5;
		me3.sex = 'm';
		me3.workInTheItIndustry = false;
		
		me3.aboutMe();
	
	}
		}
