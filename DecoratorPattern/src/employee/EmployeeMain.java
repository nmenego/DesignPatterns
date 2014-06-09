package employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// ordinary employee
		Employee emp0 = new EmployeeImpl("Jake Amir");
		emp0.printName();
		emp0.printType();

		// create manager employee
		Employee emp1 = new EmployeeImpl("John Doe");
		emp1 = new Manager(emp1);
		emp1.printName();
		emp1.printType();
		((Manager) emp1).profileEmployee();

		// create Team Lead (wrap style)
		Employee emp2 = new TeamLead(new EmployeeImpl("Mark Skittle"));
		emp2.printName();
		emp2.printType();
		((TeamLead) emp2).motivate();
	}

}
