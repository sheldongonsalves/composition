
public class Job {

	private String role;
	private long salary;
	private int id;
	public String getRole() {
		return role;
	}
	public void setRole(String role1) {
		this.role = role1;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary1) {
		this.salary = salary1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id1) {
		this.id = id1;
	}
	@Override
	public String toString() {
		return "Job [role=" + role + ", salary=" + salary + ", id=" + id + "]";
	}
	public Job() {
		
	}

}
