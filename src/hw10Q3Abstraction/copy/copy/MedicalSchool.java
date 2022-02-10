package hw10Q3Abstraction.copy.copy;
/*MedicalSchool abstract class use extends keyword to inherit NursingSchool abstract class. An abstract class can use only one keyword,extends,for inheritance.An abstract class can inherit only one regular or abstract class, but cannot inherit interface by extend keyword. */
public abstract class MedicalSchool extends NursingSchool {
	public MedicalSchool() {
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from the biochemistrylab");
	}
}
