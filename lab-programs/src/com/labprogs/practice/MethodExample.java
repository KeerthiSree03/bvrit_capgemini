package com.labprogs.practice;
import java.util.Scanner;
public class MethodExample {
	
	public float add(float x,float y) {
		return x+y;
	}
	
	public float subtract(float x,float y) {
		return x-y; 
	}
	
	public float multiply(float x,float y) {
		return x*y; 
	}
	
	public String divide(float x,float y) {
		String s= String.format("%.2f", x/y);
		return s; 
	}
	public float average(float x,float y) {
		return (x+y)/2;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		System.out.println("Choose the operation:\n1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Average");
		char c=sc.next().charAt(0);
		MethodExample me= new MethodExample();
		
		switch (c)
		{
		case '1':
			System.out.println("Result = "+ me.add(x, y));
			break;
		case '2':
			System.out.println("Result = "+ me.subtract(x, y));
			break;
		case '3':
			System.out.println("Result = "+ me.multiply(x, y));
			break;
		case '4':
			System.out.println("Result = "+ me.divide(x, y));
			break;
		case '5':
			System.out.println("Result = "+ me.average(x, y));
			break;
		default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}
	
}
