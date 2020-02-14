package com.labprogs.practice;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
	
		int[] s=new int[5];
		Scanner sc=new Scanner(System.in);
		//int []a= {5,10,15,20,25};
		System.out.println("Enter array");
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(s[i]>s[j]) {
					int temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("After Sorting...");
		//for(int i=0;i<s.length;i++)
		//System.out.print(s[i]+"\t");
		for(int i:s){
			System.out.print(i+"\t");
		}
		sc.close();
	}

}
