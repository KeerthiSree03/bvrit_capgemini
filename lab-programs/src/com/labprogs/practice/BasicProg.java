package com.labprogs.practice;
import java.util.Scanner;
public class BasicProg {

	public static void main(String[] args) {
		float p,n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of p: ");
		p=sc.nextFloat();
		System.out.println("enter the value of n: ");
		n=sc.nextFloat();
		System.out.println("enter the value of r: ");
		r=sc.nextFloat();
		double si=(p*n*r)/100;
	    double t= Math.pow(10,5);
	    double k=Math.round((si*t)/t);
		System.out.println("SI= "+k);
		sc.close();
	}
	
}
