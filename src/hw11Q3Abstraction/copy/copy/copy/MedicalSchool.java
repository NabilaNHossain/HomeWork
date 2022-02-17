package hw11Q3Abstraction.copy.copy.copy;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public MedicalSchool() {
		System.out.println("This is from the default constructor of MedicalSchool class.");
	}

	public abstract void anatomyLab();

	public static void neuroScience() {
		System.out.println("This is from static method of MedicalScool class.");
	}

	@Override
	public void hygeine() {
	}

	@Override
	public void caring() {
		System.out.println("This is from the caring abstarct method of Nursing class.");
	}

	public void biochemistryLab() {
		System.out.println("This is from the biochemistrylab of MedicalSchool class.");
	}

	@Override
	public void lawSchoollInfo() {
		System.out.println("This is from the LawSchool class.");
	}

	@Override
	public void aeronauticalInfo() {
	}

	@Override
	public void mechanicalLab() {
	}

	@Override
	public void computerLab() {
	}

	@Override
	public void maths() {
	}
}