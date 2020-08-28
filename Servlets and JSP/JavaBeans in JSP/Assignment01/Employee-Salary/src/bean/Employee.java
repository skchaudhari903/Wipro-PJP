package bean;

public class Employee {
	private String empName;
	private int id, base, bonus;

	public Employee() {

	}

	public Employee(String empName, int id, int base, int bonus) {
		this.empName = empName;
		this.id = id;
		this.base = base;
		this.bonus = bonus;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
