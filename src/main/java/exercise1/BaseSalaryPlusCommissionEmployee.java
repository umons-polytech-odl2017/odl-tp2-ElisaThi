package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private String name;
	private int baseSalary;
	private int commission;
	private static int sales = 0;

	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.commission = commission;
		sales = 0;
	}

	public void sell() {
		sales ++ ;
	}

	public void workOneHour() {}


	public int computeSalary() {
		return baseSalary + commission * sales;
	}

	public String getName() {
		return name;
	}

}
