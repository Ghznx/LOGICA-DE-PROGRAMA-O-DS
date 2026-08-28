package exercicios;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		double resultado;
		int opc;
		
		do {
			System.out.print("Informe o numero: ");
			numero = leia.nextInt();
			
			System.out.println("1 - Informar o numero: ");
			System.out.println("2 - Numero ao quadrado: ");
			System.out.println("3 - Numero ao cubo: ");
			System.out.println("4 - Raiz quadrada do numero: ");
			System.out.println("0 ou menos - Sair: ");
			
			System.out.print("Informe a opção desejada: ");
			opc = leia.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Número informado: "+ numero);
				break;
			case 2:
				resultado = numero * numero;
				System.out.println("Número elevado ao quadrado: "+ resultado);
				break;
			case 3:
				resultado = numero * numero * numero;
				System.out.print("Número elevado ao cubo: "+ resultado);
				break;
			case 4:
				resultado = Math.sqrt(numero);
				System.out.println("Raiz quadrada do número: "+ resultado);
				break;
			default:
				System.out.println("Opção invalida");
			} 
		} while(numero > 0);
		
		leia.close();
	}

}
