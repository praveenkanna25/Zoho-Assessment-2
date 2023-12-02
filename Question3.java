package test.org;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int count = sc.nextInt();
        int[] arr = new int[count];
        int a = 5;

        System.out.println("Enter the array:");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j + 1; k <= arr.length - 1; k++) {
                if ((arr[j] + arr[k]) % a == 0) {
                    System.out.println("[" + arr[j] + "," + arr[k] + "]");
                }
            }
        }
    }
}



