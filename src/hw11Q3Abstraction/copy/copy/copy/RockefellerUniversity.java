package hw11Q3Abstraction.copy.copy.copy;

public class RockefellerUniversity extends EnginneringSchool implements AeronauticalSchool {
	public void maths() {
		System.out.println("This outcome is from Math of RockefellerUniversity.");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This is from the AeronauticalSchool.");
	}

	@Override
	public void mechanicalLab() {
		System.out.println("This is from the mechanicalLab of the EngineeringSchool.");
	}

	@Override
	public void computerLab() {
		System.out.println("This is from the computerLab method of EngineeringSchool.");
	}

}