package com.naren.firstPieceofCodeUsingArrays;

public class studentRunner {

	public static void main(String[] args) {
		//int[] marks = {97,98,100};
		Student student = new Student("naren",97,98,100);
		Student student1 = new Student("naren1",90,95,100);
		Student student2 = new Student("naren2",92,93,99,100);
		//int number = student.getNumOfMarks();
		System.out.println("number of marks is "+ student2.getNumOfMarks());
		System.out.println("sum of marks is "+ student2.getSumOfMarks());
		System.out.println("max of marks is "+ student2.getMaxMarks());
		System.out.println("min of marks is "+ student2.getMinMarks());
		System.out.println("avg of marks is "+ student2.getAvgMarks());
		
		student2.addMarks(60);
		System.out.println(student2);
		
		student2.removeMarks(4);
		System.out.println(student2);
	}
}
