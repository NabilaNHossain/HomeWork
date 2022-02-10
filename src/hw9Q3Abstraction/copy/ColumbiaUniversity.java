package hw9Q3Abstraction.copy;

/*One keyword is used for the inheritance for a Regular class,which is "extends".Yes,a Regular class can inherit       an Abstract class using the extends keyword.A Regular class can inherit only one Regular or Abstract class.
*/
public class ColumbiaUniversity extends MedicalSchool {
	public ColumbiaUniversity() {
	}

	/*
	 * public abstract void chemistry(); The abstract method chemistry in type
	 * ColumbiaUniversity can only be defined by an abstract class.Inside a Regular
	 * classMethod can only be implemented.
	 */

	public void biology() {
		System.out.println("This outcome is from the Biology");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygeine() {
		// TODO Auto-generated method stub

	}
}
