package hw9Q3Abstraction.copy;

/*One keyword is used for the inheritance for a Regular class,which is "extends".Yes,a Regular class can inherit an Abstract class using the extends keyword.A Regular class can inherit only one Regular or Abstract class,but cannot inherit an Interface by extends keyword.
*/
public class ColumbiaUniversity extends MedicalSchool {
	public ColumbiaUniversity() {
	}

	public void biology() {
		System.out.println("This outcome is from the Biology");
	}

	@Override
	public void anatomyLab() {
	}

	@Override
	public void hygeine() {
	}
}
