package test.org;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int result = 0;
		int n = 0;
		int tempNum = 0;
		int remainder = 0;
		tempNum = num;
		while (tempNum != 0) {
			tempNum /= 10;
			++n;
		}

		tempNum = num;

		while (tempNum != 0) {
			remainder = tempNum % 10;

			int a = 1;
			for (int i = 0; i < n; i++) {
				a *= remainder;
			}

			result += a;
			tempNum /= 10;
		}

		if (result == num)
			System.out.println(num + " is a Armstrong number.");
		else
			System.out.println(num + " is not a Armstrong number.");
	}

}
