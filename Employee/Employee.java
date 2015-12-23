package WebFrequency;

public class Employee {

	private String firstName;
	private String lastName;
	private float salary;
	private int employeeId;

	//Constructor with arguments 
	/**
	 * @param firstName
	 * @param lastName
	 */
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/**
	 * 
	 */
	public Employee() {
		this("Will" , "Sokolowski");
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}


	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}


	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public void showEmp() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Salary: " + salary);
		
	}
}
