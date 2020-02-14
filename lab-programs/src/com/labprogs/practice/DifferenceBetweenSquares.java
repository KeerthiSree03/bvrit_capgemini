package com.labprogs.practice;
import java.util.Scanner;

public class DifferenceBetweenSquares {
	private static Scanner sc;
	public static int sumOfSquares(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			int s=0;
			s=i*i;
			sum=sum+s;
		}
		return sum;
	}
public static int squareOfSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		return sum*sum;
	}
	
	public static int CalculateDifference(int n) {
		 return squareOfSum(n)-sumOfSquares(n);
		
	}
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int diff=CalculateDifference(num);
		System.out.println(diff);
		
	}

}
