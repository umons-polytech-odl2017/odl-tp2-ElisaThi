package exercise1;

public class FixedSalaryEmployee extends Employee{
	private String name;
	private int fixedSalary;

	public FixedSalaryEmployee (String name, int fixedSalary) {
		this.name = name;
		this.fixedSalary = fixedSalary;
	}

	public int computeSalary() {
		return fixedSalary;
	}

	public void sell() {}

	public void workOneHour() {}

	public String getName() {
		return name;
	}
}
