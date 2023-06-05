package com.prowings.BasicPrograms.ClassObject;

public class B extends A{

	public void m1() {
		System.out.println("in class b");
	}
	public static void main(String[] args) {
		A a =new B();
//		B b =new B();
		a.m1();
	}

	@Override
	public void m1(String s,int i) {
		// TODO Auto-generated method stub
//		super.m1(s);
	}
}
