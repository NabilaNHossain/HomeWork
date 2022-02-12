package hw9Q3Abstraction.copy;

/*One keyword is used for inheritance in Java for Abstract class.MedicalSchool abstract class uses "extends" keyword to inherit NursingSchool Abstract class.An abstract class can inherit only one regular or abstract class, but cannot inherit interface by extend keyword. More than one inheritance is possible by an Abstract class.*/
public abstract class MedicalSchool extends NursingSchool {
	public MedicalSchool() {
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from the biochemistrylab");
	}
}
