package hw11Q3Abstraction.copy.copy.copy;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	public ColumbiaUniversity() {
		System.out.println("This is from the default constructor of the ColumbiaUniversity class.");
	}

	public void biology() {
		System.out.println("This outcome is from the biology method of ColumbiaUniversity.");
	}
	
	public static void cu() {
		System.out.println("This is from the static method of ColumbiaUniversity.");
	}

	@Override
	public void emergencyRoom() {
		System.out.println("This is from the emergencyRoom of Hospital class.");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("This is from the surgeryRoom of Hospital class.");
	}

	@Override
	public void cafeteria() {
		System.out.println("This is from the cafeteria of Hospital class");
	}

	@Override
	public void morgue() {
		System.out.println("This is from the morgue of Hospital class");
	}

	@Override
	public void commonRoom() {
		System.out.println("This is from the commonRoom of College.");
	}

	@Override
	public void laboratory() {
		System.out.println("This is from the laboratory of College.");
	}

	@Override
	public void languageClub() {
		System.out.println("This is from languageClub of College.");
	}

	@Override
	public void dorm() {
		System.out.println("This is from the dorm of College.");
	}

	@Override
	public void lawSchoollInfo() {
		System.out.println("This is from LawSchool class.");
	}

	@Override
	public void vocatinalInfo() {
		System.out.println("This is from Vocational school.");
	}

	@Override
	public void classSize() {
		System.out.println("This is from the classSize of University class.");
	}

	@Override
	public void playGround() {
		System.out.println("This is from the  playGround method of University class.");
	}

	@Override
	public void teacher() {
		System.out.println("This is from the teacher of University class.");
	}

	@Override
	public void gymnasium() {
		System.out.println("This is from the gymnasium of University class.");
	}

	@Override
	public void anatomyLab() {
		System.out.println("This is from anatomyLab of MedicalSchool class.");
	}

	@Override
	public void hygeine() {
		System.out.println("This is from the hygeine of NursingSchool.");
	}

	@Override
	public void caring() {
	}

	@Override
	public void biochemistryLab() {
	}
}
