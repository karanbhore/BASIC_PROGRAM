package com.prowings.BasicPrograms.ClassObject;

public class Student {

	private int rollNumber;
	private String name;
	private double marks;
	private String city;

	public void acceptData(int rollNumber, String name, double marks, String city) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}

	public void displayData() {
		System.out.println("Roll number : " + rollNumber);
		System.out.println("name : " + name);
		System.out.println("Marks : " + marks);
		System.out.println("city : " + city);

	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.acceptData(101, "Ram", 90.56, "Mumbai");

		student1.displayData();

	}

}
