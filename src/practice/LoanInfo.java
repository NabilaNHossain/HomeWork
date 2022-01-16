package practice;

public class LoanInfo {

	public String name = "Nabila";
	public byte age = 33;
	public float interestRate = 2.75f;
	public int loanAmount = 350000;
	public boolean approvedForLoan = true;
	public double lateFeeRate = 1.85966565;
	public char sex = 'f';
	public long appraisalValue = 315000l;

	public LoanInfo() {

	}

	public void loanInfo() {
		System.out.println("The name of the customer is " + name + ".\nShe is a " + sex
				+ ". The loan amount she's approved for is " + loanAmount + "$. \nThe house is valued at "
				+ appraisalValue + "\nThe interst rate is " + interestRate + "%.\nThe late fee applies at "
				+ lateFeeRate + "%.");
	}

//	public static void main(String[] args) {
//		LoanInfo info = new LoanInfo();
//		info.loanInfo();
//
//	}

}
