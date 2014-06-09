package employee;

import java.util.Date;

public abstract class EmployeeDecorator extends Employee {

	protected Employee employee;

	protected EmployeeDecorator(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void printName() {
		employee.printName();
	}

	@Override
	public void join(Date joinDate) {
		employee.join(joinDate);
	}

	@Override
	public void terminate(Date terminateDate) {
		employee.terminate(terminateDate);
	}

}
