package programasejemplo;

import java.util.Scanner;

public class RevisorAnoBisiesto {

	public static void main(String[] args) {
		System.out.println("Dado un año, determinar si es bisiesto o no");
		System.out.print("Ingrese el año: ");
		Scanner entrada = new Scanner(System.in);
		int anio = entrada.nextInt();
		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
			System.out.println(anio + " es BISIESTO");
		} else {
			System.out.println(anio + " NO es BISIESTO");
		}
		entrada.close();
	}

}
