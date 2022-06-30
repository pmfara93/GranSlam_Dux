/*En esta clase , se le permite al usuario seleccionar el formato de partido ( mejor 3 sets o mejor 5 sets)
 
 se declara un arreglo que contiene el numero de sets (6)
 
 se utiliza un switch case para cada formato disponible elegido anteriormente por el usuario ( 3 sets o 5 sets)
 
 dentro de cada switc se recorre el arreglo y se detiene en el momento proporcional a la eleccion de formato.
 
 
 * 
 */

package GranSlam;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OpcionsetsGanador {

	public void LogicaSets() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("1-Mejor 3 sets" + "\n" + "2-Mejor 5 sets");

		int eleccion = entrada.nextInt();

		int[] games = new int[7];

		switch (eleccion) {

		case 1:
			if (eleccion == 1) {

				System.out.println("Se eligió al mejor de 3 sets");

				

						for (int cont_game = 0; cont_game < games.length; cont_game++) {

							System.out.print(games.length - 1);
							System.out.print(" ");
							System.out.print(games.length - 1);
							break;
						}
					}
				
			break;
		case 2:

			if (eleccion == 2) {
				System.out.println("Se eleigió al mejor de 5 sets");

						for (int cont_game = 0; cont_game < games.length; cont_game++) {

							System.out.print(games.length - 1);
							System.out.print(" ");
							System.out.print(games.length - 1);
							System.out.print(" ");
							System.out.print(games.length - 1);
                          break;
						}

					}
				}
			}
		
	}


