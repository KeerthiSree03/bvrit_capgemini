package com.labprogs.practice;
import java.util.Scanner;

public class PatternPrinting {
	public static int oddOrEven(int n) {
		if(n%2==0)
			return 0;
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int c=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(PatternPrinting.oddOrEven(i+j+1)+" ");
				//System.out.print((i+j-1)%2+ " ");
				//System.out.print("* ");
				//System.out.print(i+" ");
				//System.out.print(j+" ");
				System.out.print(c+" ");
				c++;
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
