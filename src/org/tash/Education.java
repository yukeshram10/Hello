package org.tash;

public class Education {
	public void ug(String a) {
		System.out.println("Program Type:" + a);
	}
	public void pg(String b) {
		System.out.println("Program Type:" + b);
	}
	public static void main(String[] args) {
		Education c = new Education();
		c.ug("Under Graduate");
		c.pg("Post Graduate");
		System.out.println("Project by test1");
		System.out.println("Task Completed");
	}

}
