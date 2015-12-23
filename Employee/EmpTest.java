package WebFrequency;

public class EmpTest {

	public static void main(String[] args) {

		Employee e = new Employee("Will", "Sokolowski");
		e.setFirstName("Will");
		e.setLastName("Sokolowski");
		e.setSalary(70000F);
		e.setEmployeeId(0001);
		e.showEmp();

		Employee e2 = new Employee();
		e2.showEmp();
	}
}
