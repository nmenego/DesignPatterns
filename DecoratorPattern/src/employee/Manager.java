package employee;

public class Manager extends EmployeeDecorator {

	protected Manager(Employee employee) {
		super(employee);
	}

	public void assignTask() {
		System.out.println(employee.getName() + " is assigning tasks.");
	}

	public void profileEmployee() {
		System.out.println(employee.getName() + " is profiling employees.");
	}

	public void createRequirments() {
		System.out.println(employee.getName() + " is creating requirement documents.");
	}
}
