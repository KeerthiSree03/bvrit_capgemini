package com.labprogs.practice;

import java.util.Scanner;

public class SumCalculation {

	public static int calculateSum(int n) {
		int c=0 , sum=0;
		for(int i=1;c<n;i++) {
			if((i%3==0)||(i%5==0))
			{
				sum=sum+i;
				c++;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int k= calculateSum(num);
		System.out.println("Sum of first "+num+" numbers which are divisible by 3 & 5 is "+k);
		sc.close();
		}

}
