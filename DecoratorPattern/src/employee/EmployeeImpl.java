package employee;

import java.util.Date;

public class EmployeeImpl extends Employee {

	public EmployeeImpl(String name) {
		super.setName(name);
	}

	@Override
	public void join(Date joinDate) {
		System.out.println(this.getName() + " joined on " + joinDate);
	}

	@Override
	public void terminate(Date terminateDate) {
		System.out.println(this.getName() + " terminate on " + terminateDate);
	}

	@Override
	public void printName() {
		System.out.println("Employee: " + this.getName());
	}

}
