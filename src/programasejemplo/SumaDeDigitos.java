package programasejemplo;

import java.util.Scanner;

public class SumaDeDigitos {

	public static void main(String[] args) {
		System.out.println("Dato un número entero, extraer sus dígitos y sumarlos.");
		System.out.print("Ingrese un número: ");
		try(Scanner entrada = new Scanner(System.in)){
			int digito, suma = 0, num = entrada.nextInt();
			while ( num != 0) {
				digito = num % 10;
				suma += digito;
				num /= 10;
			}
			System.out.println("La suma de los dígitos es " + suma);
			//entrada.close();
		}
	}

}
