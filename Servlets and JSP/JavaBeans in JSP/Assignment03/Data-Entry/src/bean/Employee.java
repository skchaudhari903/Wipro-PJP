package bean;

public class Employee {
	private String empName, desg;
	private int id;

	public Employee() {

	}

	public Employee(int id, String empName, String desg) {
		this.id = id;
		this.empName = empName;
		this.desg = desg;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
