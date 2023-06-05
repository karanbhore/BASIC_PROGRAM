package practise;

import java.util.List;

public class Institute {

	String name;
	List<Department> departments;
	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Institute(String name, List<Department> departments) {
		super();
		this.name = name;
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Institute [name=" + name + ", departments=" + departments + "]";
	}
	
	public int getTotalStudentsInInstitute() {
		int noOfStudents=0;
		List<Student> students;
		
		for(Department dept:departments) {
			students=dept.getStudents();
			for(Student s:students) {
				noOfStudents ++;
				
			}
		}
		return noOfStudents;
	}
	
	
	
	
	
	
	
}
