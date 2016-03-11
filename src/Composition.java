import java.util.ArrayList;

public class Composition {

	public static void main(String []args)
	{
		Person bobby = new Person();
		Job job1 = new Job();
		Job job2 = new Job();
		Job job3 = new Job();
		
		ArrayList<Education> schoollist = new ArrayList<Education>();
		ArrayList<Job> joblist =new ArrayList<Job>();
		
		
		Education edu =new Education();
		Education edu1 =new Education();
		Education edu2 =new Education();
		edu.setSchoolname("GWU");
		schoollist.add(edu);
		edu1.setSchoolname("st xaviers");
		schoollist.add(edu1);
		edu2.setSchoolname("Kindergarden");
		schoollist.add(edu2);
		bobby.setEducation(schoollist);
		
		
		job1.setSalary(10000);
		job1.setRole("Analyst");
		joblist.add(job1);
		job2.setRole("Analyst1");
		joblist.add(job2);
		job3.setRole("Analyst2");
		joblist.add(job3);
		bobby.setRole(joblist);
		
		for(Education e:bobby.getEducation())
		{
		
		System.out.println(e);
		
		}
		for(Job j:bobby.getRole())
		{
		
		System.out.println(j);
		
		}
	}
		

}
