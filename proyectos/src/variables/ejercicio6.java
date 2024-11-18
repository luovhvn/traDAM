package variables;

public class ejercicio6 {
		public static void main (String[] args) {
			
			int a = 4, b = 8;
			
			System.out.println("El valor de a al principio es " + a + ", y el de b " + b);
			
			a = a + b;
			b = a - b;
			a = a - b;
			
			System.out.println("Ahora el valor de a es " + a + ", y el de b " + b);
			
		}
}
