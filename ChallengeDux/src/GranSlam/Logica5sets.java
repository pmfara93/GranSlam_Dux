package GranSlam;

public class Logica5sets {

	int[] arreglo = new int[7];
	int[] arreglo1 = new int[7];

	/*Clase donde desarrollo la logica para cuando la opcion sea al mejor de 5 sets.
	 * 
	 * utilizando dos arreglos (uno para los games del ganador y otro para los del perdedor).
	 * 
	 * el arreglo del ganador simulará numeros iguales a 6.
	 * 
	 * el arreglo de perdedor simulará numeros iguales o menores a 4.
	 * 
	 */

	
	
	
	public Logica5sets() {

	}

	public void Desarrollo5sets() {

		for (int i = 0; i < arreglo.length; i++) {

			int dato = arreglo[i] = (int) (Math.random() * 7);

			if (dato > 5) {

				System.out.print(" ");

				System.out.print(dato);

				System.out.print(" ");

				System.out.print(dato);

				System.out.print(" ");

				System.out.print(dato);
				break;
			}

		}

		for (int j = 0; j < arreglo1.length; j++) {
			int dato1 = arreglo1[j] = (int) (Math.random() * 5);

			if (dato1 != 5) {

				System.out.println("");

				System.out.print(" ");

				System.out.print(dato1);

				System.out.print(" ");

				System.out.print(dato1);
				
				System.out.print(" ");

				System.out.print(dato1);

				break;
			}

		}

	}

}
