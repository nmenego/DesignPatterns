package employee;

import java.util.Date;

public abstract class Employee {

	private String name;
	public abstract void join(Date joinDate);
	public abstract void terminate(Date terminateDate);
	public abstract void printName();

	public void printType() {
		System.out.println(this.getClass());
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
