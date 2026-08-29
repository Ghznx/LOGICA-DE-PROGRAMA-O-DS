package exercicio15;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[8];
		int qtdPar = 0;
		int qtdImpar = 0;
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.print("Informe o "+ (i+1)+"º numero: ");
			numeros[i] = leia.nextInt();
		}
		for(int i = 0;i < numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println("Número "+ numeros[i]+ ": Par");
				qtdPar++;
			} else {
				System.out.println("Número "+ numeros[i]+ ": Impar");
				qtdImpar++;
			}
		}
		
		System.out.println("Quantidade de pares: "+ qtdPar);
		System.out.println("Quantidade de impares: "+ qtdImpar);
	}

}
