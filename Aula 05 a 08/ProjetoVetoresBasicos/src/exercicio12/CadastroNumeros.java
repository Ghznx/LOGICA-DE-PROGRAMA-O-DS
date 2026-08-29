package exercicio12;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] numero = {'0','0','0','0','0'};
		
		for(int i = 0;i < 5; i++) {
			System.out.print("Digite o número da posição "+ i + ": ");
			numero[i] = leia.nextInt();
		}
		for(int i = 0;i < 5; i++) {
			System.out.println("Número na posição "+ i +": " + numero[i]);
		}
		leia.close();
	}

}
