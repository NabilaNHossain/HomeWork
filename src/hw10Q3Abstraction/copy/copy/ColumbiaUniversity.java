package hw10Q3Abstraction.copy.copy;

/*Two keywords can be used for inheritance in Java Regular class.Yes,a Regular class can inherit one Regular or one abstract class by using the word "extends. While at the same time a Regular class can inherit more than one Interface by using the word "implements".More than one inheritance is possible by an Abstract class.*/
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	public ColumbiaUniversity() {
	}

	public void biology() {
		System.out.println("This outcome is from the Biology");
	}

	@Override
	public void emergencyRoom() {
	}

	@Override
	public void surgeryRoom() {
	}

	@Override
	public void cafeteria() {
	}

	@Override
	public void commonRoom() {
	}

	@Override
	public void laboratory() {
	}

	@Override
	public void languageClub() {
	}

	@Override
	public void lawSchoollInfo() {
	}

	@Override
	public void vocatinalInfo() {
	}

	@Override
	public void classSize() {
	}

	@Override
	public void playGround() {
	}

	@Override
	public void teacher() {
	}

	@Override
	public void anatomyLab() {
	}

	@Override
	public void hygeine() {
	}

}
