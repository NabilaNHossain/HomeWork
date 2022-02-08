package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("William");
		employee.setAge(40);
		employee.setSex('M');
		employee.setUsCitizen(false);
		System.out.println("Hello!I am " + employee.getName() + ". I am " + employee.getAge() + " years old. I am a "
				+ employee.getSex() + ". Am I a US citizen?Ans:" + employee.isUsCitizen() + ".");

	}

}
