package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Informe a idade do nadador: ");
		int idade = leia.nextInt();
		
		if(idade < 5) {
			System.out.println("Sem categoria");
		} else if(idade <= 7) {
			System.out.println("Infantil");
		} else if(idade <= 10) {
			System.out.println("Juvenil");
		} else if(idade <= 15) {
			System.out.println("Adolescente");
		} else if(idade <= 30) {
			System.out.println("Adulto");
		} else {
			System.out.println("Sênior");
		}
		
		leia.close();
	}

}
