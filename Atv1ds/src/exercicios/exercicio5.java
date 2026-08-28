package exercicios;

import java.util.Scanner;

public class exercicio5 {

	private static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		System.out.print("Informe um número: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Opção inválida");
		}
		
		leia.close();
	}

}
