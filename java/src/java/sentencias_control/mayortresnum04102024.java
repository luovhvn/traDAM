package java.sentencias_control;

import java.util.Scanner;

public class mayortresnum04102024 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el primer número");
		int num1 = scan.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = scan.nextInt();
		System.out.println("Introduce el tercer número");
		int num3 = scan.nextInt();

		int mayor = num1;

		if (num2 > mayor) {
			mayor = num2;
		}
		if (num3 > mayor) {
			mayor = num3;
		}
		System.out.println("El número mayor es " + mayor);
	}
}
