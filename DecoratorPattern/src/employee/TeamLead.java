package employee;

public class TeamLead extends EmployeeDecorator {

	protected TeamLead(Employee employee) {
		super(employee);
	}

	public void planing() {
		System.out.println(employee.getName() + " is planing.");
	}

	public void motivate() {
		System.out.println(employee.getName() + " is motivating his members.");
	}
}
