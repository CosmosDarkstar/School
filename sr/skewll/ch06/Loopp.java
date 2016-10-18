package skewll.ch06;

import java.util.Scanner;

public class Loopp {

	public static void main(String[] args) {
		double amt;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much is the transaction");
		amt = scanner.nextDouble();
		while (scanner.hasNextDouble()) {
			double f = amt;
			amt = scanner.nextDouble();
			if (amt == f) {
				System.out.println("Duplicate transaction?");
			}
		}
	}

}
