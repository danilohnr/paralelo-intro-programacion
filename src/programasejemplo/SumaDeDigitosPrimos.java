package programasejemplo;

import java.util.Scanner;

public class SumaDeDigitosPrimos {

	public static void main(String[] args) {
		System.out.println("Dado un número entero, extraer sus dígitos, verificar cuáles son primos y sumarlos");
		System.out.print("Ingrese un número: ");
		Scanner entrada = new Scanner(System.in);
		int digito, suma = 0, num = entrada.nextInt();
		while ( num != 0) {
			digito = num % 10;
			if (digito == 2 || digito == 3 || digito == 5 || digito == 7) {
				suma += digito;
			}			
			num /= 10;
		}
		System.out.println("La suma de los dígitos es " + suma);
		entrada.close();
	}

}
