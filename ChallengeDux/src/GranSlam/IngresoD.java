
/*Esta clase , es la encargada de permitir la entrada de dato requerida al usuario , para proceder al funcionamiento del programa
 Equivalencias de variables: entradateclado = nombre del torneo
                             entradateclado1= nombre del jugador 1
                             entradateclado2= nombre jugador 2
                             entradateclado3= formato torneo (3 sets)
                             entradateclado4= formato torneo (5 sets)
                             entradateclado5= porcentaje victoria jugador 1
                             entradateclado6= porcentaje victoria jugador 2
 * 
 */

package GranSlam;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IngresoD {

	String entradaTeclado = "";
	String entradaTeclado1 = "";
	String entradaTeclado2 = "";
	int entradaTeclado3 = 1;
	int entradaTeclado4 = 2;
	int entradateclado5;
	int entradateclado6;

	public void Datos() {

		Scanner entradaEscaner = new Scanner(System.in);

		System.out.println("Nombre del torneo :");
		entradaTeclado = entradaEscaner.nextLine();

		System.out.println("\n" + "ingresar el nombre de los jugadores:" + "\n");

		System.out.println("Nombre jugador 1:");
		entradaTeclado1 = entradaEscaner.nextLine();

		System.out.println("\n" + "Nombre jugador 2: ");
		entradaTeclado2 = entradaEscaner.nextLine();

		System.out.println("\n" + "Jugador 1:" + entradaTeclado1);
		System.out.println("Jugador 2:" + entradaTeclado2);

		System.out.println("\n" + "% de posible triunfo de (solo numero):" + entradaTeclado1);
		entradateclado5 = entradaEscaner.nextInt();

		System.out.println("\n" + "% de posible triunfo de (solo numero):" + entradaTeclado2);
		entradateclado6 = entradaEscaner.nextInt();

	}

}
