package arrays;

import java.util.Arrays;

public class ejercicio8 {
		public static void main (String[] args) {
			
			int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {6, 7, 8, 9, 10};
	        int[] fusion = new int[array1.length + array2.length];

	        System.arraycopy(array1, 0, fusion, 0, array1.length);
	        System.arraycopy(array2, 0, fusion, array1.length, array2.length);

	        System.out.println(Arrays.toString(fusion));
			
		}
}
