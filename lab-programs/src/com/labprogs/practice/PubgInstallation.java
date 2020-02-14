package com.labprogs.practice;
import java.util.Scanner;

public class PubgInstallation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("Enter your gender: ");
		
		//char gender=sc.next().toUpperCase().toCharArray()[0];

		char gender=sc.next().toUpperCase().charAt(0);
		switch(gender) {
		case 'M':
			if(age>30)
				System.out.println("Sorry Mr. "+name+"...You are too old to play pubg");
			else if(age<18)
				System.out.println("Sorry Mr. "+name+"...You are too young to play pubg");
			else 
				System.out.println("Hello Mr. "+name+"!!!Welcome to Pubg");
			break;
		
		case 'F':
			if(age>25)
				System.out.println("Sorry Mrs. "+name+"...You are too old to play pubg");
			else if(age<16)
				System.out.println("Sorry Mrs. "+name+"...You are too young to play pubg");
			else 
				System.out.println("Hello Mrs. "+name+"!!!Welcome to Pubg");
			break;
	
		default: 
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}
