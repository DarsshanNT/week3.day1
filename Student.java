package org.college;

public class Student extends Department{
	public void studentname() {
		System.out.println("raja");
	}
	public void studentdep() {
		System.out.println("abcd");
	}

	public void studentid() {
		System.out.println("12345");
	}
public static void main(String[] args) {
	Student c =new Student ();
	c.collegecode();
	c.collegename();
	c.collegerank();
	c.depname();
	c.studentid();
	c.studentdep();
	c.studentname();
	
}
	

}
