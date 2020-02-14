package com.labprogs.practice;
import java.util.Scanner;

public class GradeDisplay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter your name: ");
		String name = sc.next()+sc.nextLine();*/
		System.out.println("Enter your marks: ");
		int marks=sc.nextInt();
		if(marks>100 || marks<0)
			System.out.println("Invalid marks");
		else if(marks>=80)
			System.out.println("Grade is : A");
		else if(marks>60 && marks<80)
			System.out.println("Grade is : B");
		else
			System.out.println("Grade is : F");
		
		sc.close();
	}
	
	
}
