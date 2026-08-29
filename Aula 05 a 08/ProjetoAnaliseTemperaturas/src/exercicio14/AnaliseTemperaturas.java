package exercicio14;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double maior;
		double menor;
		double[] temperatura = new double[7];
		
		
		for(int i = 0; i < 7;i++) {
			System.out.print("Temperatura do "+(i+1)+"º dia da semana: ");
			temperatura[i] = leia.nextDouble();
			if(maior < menor) {
				maior = menor;
			}
		}
	}

}
