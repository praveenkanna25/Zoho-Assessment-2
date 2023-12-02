package test.org;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fibonacci number: ");
		int number = sc.nextInt();
		int temp;
		
		int[] arr= new int[number];
	  int start =0,add=1;
	  int i=0;
		while(number>0) { 
			arr[i]=start;
			i++;
			temp = start+add;
			start=add;
			add=temp;
			number--;	
		}
		for (int j = arr.length-1; j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
		
	}
}
