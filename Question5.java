package test.org;

public class Question5 {
	public static void main(String[] args) {
		int n=9;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j < i; j++) {

				System.out.print(i - j + " ");
			}
			System.out.println();
		}

	}

}
