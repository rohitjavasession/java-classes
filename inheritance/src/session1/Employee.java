package session1;

public class Employee extends Person {
	private int id;
	private double salary;
	
	public Employee() {
		super();
	}
	/**
	 * @param id
	 * @param salary
	 */
	public Employee(String name, int age, String city, int id, double salary) {
		super(name,age,city);
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", Name " + getName() + ",\n Age\t" + getAge()
				+ ", City " + getCity() + "]";
	}
	
	
	
	

}
