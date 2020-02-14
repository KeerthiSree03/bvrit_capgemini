package com.labprogs.practice;
import java.util.Scanner;
public class Basic_3 {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name =sc.nextLine();
		System.out.println("Enter your roll: ");
		String roll=sc.next();
		System.out.println("Enter your phone: ");
		long phone=sc.nextLong();
		System.out.println("Enter your marks: ");
		float marks=sc.nextFloat();
		System.out.println("Name is \t "+name);
		System.out.println("Roll no. is \t"+roll);
		System.out.println("Phone number is \t"+phone);
		System.out.println("Marks are \t "+marks);
		sc.close();
	}
}
