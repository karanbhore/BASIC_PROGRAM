package com.prowings.BasicPrograms.ClassObject;

public class Professor {

//	Create Professor class with fields ID, name, qualification, experience, department and create methods.
	
	int id;
	String name;
	String qualification;
	double experience;
	String department;
	
	public Professor(int id, String name, String qualification, double experience, String department) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Professor\n [id=" + id + "\n name=" + name + "\n qualification=" + qualification + "\n experience="
				+ experience + "\n department=" + department + "]";
	}
	
	public static void main(String[] args) {
		Professor obj=new Professor(100, "Raj", "BE MECH", 10.3, "Software development");
		System.out.println(obj.toString());
//		System.out.println(obj==obj1);
		Professor obj1=new Professor(100, "Raj", "BE MECH", 10.3, "Software development");
		Professor obj2=obj1;
		System.out.println(obj1==obj2);
	}
}
