package practise;

import java.util.List;

public class Department {

	String name;
	List<Student> students;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", students=" + students + "]";
	}
	public List<Student> getStudents() {
		return students;
	}

}
