package programasejemplo;

import java.util.Scanner;

public class ImprimeDigitosDeNumero {

	public static void main(String[] args) {
		System.out.println("Dado un número entero, se extraerá e imprimirá sus dígitos");
		System.out.print("Ingrese un numero: ");
		Scanner entrada = new Scanner(System.in);
		int digito, num = entrada.nextInt();
		while (num != 0) {
			digito = num % 10;
			System.out.print(digito + " ");
			num = num / 10;
		}
		entrada.close();
	}
}
