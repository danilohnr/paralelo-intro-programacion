package programasejemplo;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		System.out.println("Determinar si un número es par o impar");
		System.out.print("Ingrese el número: ");
		try (Scanner entrada = new Scanner(System.in);){
			int num = entrada.nextInt();
			if (num <= 0) {
				//System.out.println("Número inválido: " + num);
				throw new IllegalArgumentException("Número inválido: " + num);
			} else if (num %2 == 0){
				System.out.println(num + " es PAR");
			} else {
				System.out.println(num + " es IMPAR");
			}
			//entrada.close();
		}
		
	}

}
