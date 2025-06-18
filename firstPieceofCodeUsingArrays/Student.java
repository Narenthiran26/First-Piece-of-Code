package com.naren.firstPieceofCodeUsingArrays;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	 private String name;
	 private ArrayList<Integer> marks = new ArrayList<Integer>();
	 
	 public Student(String name,int... marks) {
		 this.name= name;
		 
		 for(int mark:marks) {
			 this.marks.add(mark);
		 }
	 }
	 
	 public int getNumOfMarks() {
		 return marks.size();
	 }
	 
	 public int getSumOfMarks() {
		 int sum = 0;
		 for(int mark:marks) {
			 sum+=mark;
		 }
		 return sum;
	 }
	 
	 public int getMaxMarks() {
		 return Collections.max(marks);
	 }
		 /*int max =0;
		 for(int mark:marks) {
			 if(mark>max) {
				 max=mark;
			 }
		 }return max;
	 }*/
	 
	 public int getMinMarks() {
		 return Collections.min(marks);
	 }
		 /*int min =Integer.MAX_VALUE;
		 for(int mark:marks) {
			 if(mark<min) {
				 min=mark;
			 }
		 }return min;
	 }*/

	public BigDecimal getAvgMarks() {
		int sum= getSumOfMarks();
		int total= getNumOfMarks();
		
		return (new BigDecimal(sum).divide(new BigDecimal(total),3,RoundingMode.UP));
	}
	
	public String toString() {
		return name + marks;
	}

	public void addMarks(int num) {
		marks.add(num);
	}

	public void removeMarks(int ind) {
		marks.remove(ind);
		
	}
}
