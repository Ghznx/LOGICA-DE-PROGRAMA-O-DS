package exercicio13;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0;
		double media;
		
		for(int i = 0;i < 4;i++) {
			System.out.print("Informe a "+ (i+1)+ "ª nota: ");
			notas[i] = leia.nextDouble();
			soma = notas[i] + soma;
		}
		for(int i = 0;i < 4;i++) {
			System.out.println((i+1)+ "ª nota: "+ notas[i]);
		}
		
		media = soma/notas.length;
		
		System.out.println("Média: "+ media);
		
		leia.close();
	}

}
