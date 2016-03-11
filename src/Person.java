import java.util.ArrayList;
public class Person  {
	
	
	private Job job;
	private ArrayList<Education> education;
	private ArrayList<Job> job1;



	public Job getJob() {
		return job;
	}



	public void setJob(Job job) {
		this.job = job;
	}
    
	public ArrayList<Education> getEducation()
	{
		return education;
	}
	
	public void setEducation(ArrayList<Education>education)
	{
		this.education =education;
		
	}
	
	public ArrayList<Job> getRole()
	{
		return job1;
	}
	
	public void setRole(ArrayList<Job>job2)
	{
		this.job1 = job2;
	}
	
	public long getSalary()
	{
		return job.getSalary();
	}
	
	
}
