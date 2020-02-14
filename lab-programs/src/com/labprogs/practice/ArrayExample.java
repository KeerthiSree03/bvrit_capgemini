package com.labprogs.practice;
import java.util.Scanner;
public class ArrayExample {

	public static void main(String[] args) {
		int[] s=new int[5];
		Scanner sc=new Scanner(System.in);
		//int []a= {5,10,15,20,25};
		System.out.println("Enter array");
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextInt();
		}
		int max=s[0];
		int min=s[0];
		
		for(int i=0;i<s.length;i++) {
			if(s[i]>max)
			{
				max=s[i];
			}
			if(s[i]<min)
			{
				min=s[i];
			}
		}
		System.out.println("Max is "+max);
		System.out.println("Min is "+min);
		sc.close();
	}

}
