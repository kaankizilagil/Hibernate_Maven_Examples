package March7Hib.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="FK")
public class Student extends Person{
	
	private String schoolName;
	
	public Student() {
		
	}
	
	public Student(String name, String schName) {
		
		super(name);
		schoolName = schName;
	}

	/*
	public int getStdId() {
		return stdId;
	}
	*/

	/*
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	*/

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
