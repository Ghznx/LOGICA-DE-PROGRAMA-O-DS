package exercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n1;
		double n2;
		int op;
		double resultado;
		
		System.out.print("Informe o primeiro número: ");
		n1 = leia.nextInt();
		System.out.print("Informe o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("1 - Calcular a média dos números: ");
		System.out.println("2 - Subtrair o menor número do maior: ");
		System.out.println("3 - Multiplicar os números: ");
		System.out.println("4 - Dividir o primeiro número pelo segundo: ");
		
		System.out.print("Informe a opção desejada: ");
		op = leia.nextInt();
		
		switch(op) {
			case 1:
				resultado = (n1 + n2) / 2;
				System.out.print("Média dos números: "+ resultado);
				break;
			case 2:
				if(n1 > n2) {
					resultado = n1 - n2;
					System.out.print("Subtração dos números: "+ resultado);
				} else {
					resultado = n2 - n1;
					System.out.print("Subtração dos números: "+ resultado);
				}
				break;
			case 3:
				resultado = n1 * n2;
				System.out.print("Multiplicação dos números: "+ resultado);
				break;
			case 4:
				if(n2 != 0) {
					resultado = n1 / n2;
					System.out.print("Divisão dos números: "+ resultado);
					break;
				}
			default:
				System.out.println("Opção invalida");
		}
		
		leia.close();
	}

}
