package variables;

public class ejercicio10 {
		public static void main (String[] args) {
			
			int a = 80; 
			double iva = 21.0;
			
			double precio = a + (a * iva / 100);
			
			System.out.println("El precio final con iva es " + precio);
			
		}
}
