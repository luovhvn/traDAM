package java.sentencias_control;

import java.util.Scanner;

public class puntuación07102024 {
	public static void main(String[] ags) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la nota");
		int num = scan.nextInt();

		if (num >= 90) {
			System.out.println("Su nota es una A");
		}
		if (num >= 80) {
			System.out.println("Su nota es una B");
		}
		if (num >= 70) {
			System.out.println("Su nota es una C");
		}
		if (num >= 60) {
			System.out.println("Su nota es una D");
		}
		if (num < 60) {
			System.out.println("Su nota es una F");
		}
	}
}
