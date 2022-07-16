package com.Loops;

public class Do_While {
	public static void main(String[] args) {
		int n = 1;
		do {
			if (n == 5) {
			n++;	
				continue;
			}

			System.out.println("sri" + n);
			n++;
		} while (n <= 8);

	}
}
