
/*Clase principal del programa:
 * 
 * creacion de objetos necesarios para invocar a las distintas clases del programa 
 * 
 * condicionales if que funcionan capturando los valores de porcentaje ingresados por el usuario 
 * para asi , poder imprimir el resultado y el ganador del torneo.
 * 
 * uso de Switch para la eleccion del formato torneo (mejor 3 sets o mejor 5 sets).
 */

package GranSlam;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Clase_principal {

	public static void main(String[] args) {

		// objeto de clase IngresoD para utilizar los valores de porcentaje mas adelante
		

		IngresoD pantalla = new IngresoD();

		pantalla.Datos();

		int valor = pantalla.entradateclado5;
		int valor1 = pantalla.entradateclado6;

		// objeto clase Logica3sets
		Logica3sets mtres = new Logica3sets();
		
		// objeto clase Logica5sets
		
		Logica5sets mcinco = new Logica5sets();

		System.out.println("" + "\n");

		String seleccion = JOptionPane.showInputDialog("1-Mejor 3 sets , 2-Mejor 5 sets");

		int eleccion = Integer.parseInt(seleccion);

		// la variable valor es = al porcentaje de primer jugador.
		// la variable valor1 es = al porcentaje segundo jugador.

		switch (eleccion) {
		
		// Al mejor de 3 sets

		case 1:
			
			
			if (eleccion == 1) {

				if (valor > valor1) {

					System.out.println("Resultado:");

					System.out.print("");

					mtres.Desarrollo3sets();

					System.out.println("");
					System.out.println("");

					System.out.println("Ganador del torneo es: " + pantalla.entradaTeclado1);

				} else if (valor < valor1) {

					System.out.println("Resultado:");

					System.out.print("");

					mtres.Desarrollo3sets();

					System.out.println("");
					System.out.println("");

					System.out.println("Ganador del torneo es: " + pantalla.entradaTeclado2);

				}
				break;
			}

			// Al mejor de 5 sets

		case 2:
			if (eleccion == 2) {
				if (valor > valor1) {

					System.out.println("Resultado:");

					System.out.print("");

					mcinco.Desarrollo5sets();

					System.out.println("");
					System.out.println("");

					System.out.println("Ganador del torneo es: " + pantalla.entradaTeclado1);

				} else if (valor < valor1) {

					System.out.println("Resultado:");

					System.out.print("");

					mcinco.Desarrollo5sets();

					System.out.println("");
					System.out.println("");

					System.out.println("Ganador del torneo es: " + pantalla.entradaTeclado2);
					break;
				}
			}

		}
	}
}
