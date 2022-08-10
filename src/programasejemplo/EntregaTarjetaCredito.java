package programasejemplo;

import java.util.Scanner;

public class EntregaTarjetaCredito {

	public static void main(String[] args) {
		System.out.println("Según el nivel de crédito del usuario, se le asignará una tarjeta de crédito");
		System.out.println("Nivel de crédito (400.00 - 600.00) Plateada\nNivel de crédito (600.00 - 800.00) Dorada\nNivel de crédito (800.00 - 850.00) Platino");
		System.out.print("Ingresar nivel de crédito: ");
		try(Scanner entrada = new Scanner(System.in)){
			double nivelCredito = entrada.nextDouble();
			if (nivelCredito < 400.00 || nivelCredito > 850.00) {
				System.out.println("¡Nivel de crédito inválido!");
			} else if (nivelCredito >= 400.00 && nivelCredito < 600){
				System.out.println("Tarjeta Plateada");
			} else if (nivelCredito > 600.00 && nivelCredito < 800.00) {
				System.out.println("Tarjeta Dorada");
			} else {
				System.out.println("Tarjeta Platino");
			}
		}
		//entrada.close();
	}

}
