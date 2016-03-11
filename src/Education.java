
public class Education {
	private String schoolName;
	

	public Education() {
		
		
	}
	public Education(String school_name) {
			
			this.schoolName = school_name;
			
		}


	public String getSchoolname() {
		return schoolName;
	}

	public void setSchoolname(String schoolname1) {
		this.schoolName = schoolname1;
	}
	
	@Override
	public String toString() {
		return "Education [schoolName=" + schoolName + "]";
	}


	

}
