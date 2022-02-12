package hw10Q3Abstraction.copy.copy;

/*Two keywords can be used for inheritance in Java Abstract class.Yes,an Abstract class can inherit one Regular or one Abstract class by using the word "extends. While at the same time an Abstract class can inherit more than one Interface by using the word "implements". More than one inheritance is possible by a Regular class */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public MedicalSchool() {
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from the biochemistrylab");
	}
}