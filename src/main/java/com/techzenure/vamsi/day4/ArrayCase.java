package com.techzenure.vamsi.day4;


	
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCase {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		System.out.print("enter student name: ");
		String name = sc.nextLine();
		
		System.out.print("enter no of subjects: ");
		int noOfSubjects = sc.nextInt();
		
		int[] marks = new int[noOfSubjects];
		
		marksEntry(marks);
		System.out.println("marks entered = " + Arrays.toString(marks));
		printMarks(name, marks);
		sc.close();
	}


	private static void marksEntry(int[] marks) {
		for(int i=0; i<marks.length; i++) {
			System.out.print("enter mark for Subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
		
	}

	private static void printMarks(String name, int[] marks) {
		System.out.println();
		System.out.println("STUDENT NAME: " + name.toUpperCase()+"\n");
		System.out.println("  SUBJECT\t\tMARKS");
		
		for(int i=0; i<marks.length; i++) {
			System.out.println("Subject-"+(i+1) + "\t\t  " + marks[i]);
			
		}	
		System.out.println("------------------------------");
		System.out.println("Total :"+ marks + "\t\t" + "Average :" );
	}	

}

	



