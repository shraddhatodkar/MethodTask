package com.sjt.method;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Task obj=new Task();
		
		System.out.println("Enter the range a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.PrintRange(a,b);
		
		System.out.println("Enter the range p and q:");
		int p=sc.nextInt();
		int q=sc.nextInt();
		obj.PrintOdd(p,q);
		
		System.out.println("Enter the range l and m:");
		int l=sc.nextInt();
		int m=sc.nextInt();
		obj.PrintSquare(l,m);
		
		System.out.println("Enter the range j and k:");
		int j=sc.nextInt();
		int k=sc.nextInt();
		obj.PrintSum(j,k);
		
		System.out.println("Enter the num s and t:");
		int s=sc.nextInt();
		int t=sc.nextInt();
		obj.PrintProduct(s,t);
	}
}
