package practise;

import java.util.ArrayList;
import java.util.List;

public class AggregationDemo {

	public static void main(String[] args) {

		Student s1 = new Student("Ram", 10, "CSE");
		Student s2 = new Student("Pooja", 11, "CSE");
		Student s3 = new Student("Hari", 12, "EEE");
		Student s4 = new Student("Sham", 13, "EE");
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s2);
		List<Student> ee_students = new ArrayList<Student>();
		ee_students.add(s4);
		ee_students.add(s3);

		Department cse = new Department("CSE", cse_students);
		Department ee = new Department("EE", ee_students);
		List<Department> departments = new ArrayList<>();
		departments.add(ee);
		departments.add(cse);

		Institute institute = new Institute("ICRE", departments);

		System.out.println("Institute name" + institute.name);
		System.out.println("Institute departments" + institute.departments);
		System.out.println("Students in institute " + institute.getTotalStudentsInInstitute());

	}
}
