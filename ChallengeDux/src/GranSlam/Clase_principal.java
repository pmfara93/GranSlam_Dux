
/*Clase principal del programa , en esta clase importe las librerias necesarias ( libreria:Scanner)
 * 
 * creacion de objetos necesarios para invocar a las distintas clases del programa 
 * 
 * condicionales if que funcionan capturando los valores de porcentaje ingresados por el usuario 
 * para asi , poder imprimir el resultado y el ganador del torneo.
 */

package GranSlam;

import java.util.Scanner;

public class Clase_principal {

	public static void main(String[] args) {

		IngresoD pantalla = new IngresoD();

		pantalla.Datos();

		System.out.println("" + "\n");

		int valor = pantalla.entradateclado4;
		int valor1 = pantalla.entradateclado5;

		if (valor > valor1) {

			OpcionsetsGanador cantidadsets = new OpcionsetsGanador();

			cantidadsets.LogicaSets();
			System.out.print("" + pantalla.entradaTeclado1);

			
			System.out.println(" ");
			
			OpcionsetsPerdedor cantidadperdedor = new OpcionsetsPerdedor();
			cantidadperdedor.LogicaSets_perdedor();
			System.out.print(" " + pantalla.entradaTeclado2);
			
			System.out.println(" ");
			
			System.out.println("Ganador del torneo:" + pantalla.entradaTeclado);
			
			System.out.println(" ");
			
			System.out.println("Jugador:" + pantalla.entradaTeclado1);

		} else if (valor < valor1) {

			OpcionsetsGanador cantidadsets1 = new OpcionsetsGanador();

			cantidadsets1.LogicaSets();
			System.out.print("" + pantalla.entradaTeclado2);
			
			System.out.println(" ");

			OpcionsetsPerdedor cantidadperdedor = new OpcionsetsPerdedor();
			cantidadperdedor.LogicaSets_perdedor();
			System.out.print("" + pantalla.entradaTeclado1);
            
			System.out.println(" ");
			
			System.out.println("Ganador del torneo:" + pantalla.entradaTeclado);
			
			System.out.println(" ");
			
			System.out.println("Jugador:" + pantalla.entradaTeclado2);


		}
	}
}
