package programasejemplo;

import java.util.Scanner;

public class CuentaDigitosDeUnNumero {

	public static void main(String[] args) {
		System.out.println("Dado un número entero, contar sus dígitos");
		System.out.print("Ingrese un número: ");
		Scanner entrada = new Scanner(System.in);
		int contador = 0, num = entrada.nextInt();
		while ( num!= 0) {
			contador++;
			num /= 10;
		}
		System.out.println("La cantidad de dígitos es " + contador);
		entrada.close();
	}

}
