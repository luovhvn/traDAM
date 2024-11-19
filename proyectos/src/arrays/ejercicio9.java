package arrays;

public class ejercicio9 {

	public static void main(String[] args) {
		String cadena = "dinosaurio";

		char[] arrayCaracteres = new char[cadena.length()];
		arrayCaracteres = cadena.toCharArray();
		
		int vocales = 0;
		
		for (int i = 0; i <= cadena.length() - 1; i++) {
			if (arrayCaracteres[i] == 'a' || arrayCaracteres[i] == 'A'|| arrayCaracteres[i] == 'e' || arrayCaracteres[i] == 'E'
					|| arrayCaracteres[i] == 'i' || arrayCaracteres[i] == 'I'|| arrayCaracteres[i] == 'o'||arrayCaracteres[i] == 'O'||
					arrayCaracteres[i] == 'u'|| arrayCaracteres[i] == 'U') {
				vocales++;
			}
		}
		System.out.println("Tiene " + vocales + " vocales");
	}

}


