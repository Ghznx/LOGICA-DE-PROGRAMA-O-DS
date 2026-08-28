package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double base;
		double altura;
		double area;
		
		do {
			System.out.print("Informe a base de um triângulo: ");
			base = leia.nextInt();
			if(base <= 0) {
				System.out.println("Erro! Tente novamente");
			}
		} while(base <= 0);
		
		do {
			System.out.print("Informe a altura do triângulo: ");
			altura = leia.nextInt();
			if(altura <= 0) {
				System.out.println("Erro! Tente novamente");
			}
		} while(altura <= 0);
		
		area = base * altura/2;
		
		System.out.println("A área do triângulo é: "+ area);
		
		leia.close();
	}

}
