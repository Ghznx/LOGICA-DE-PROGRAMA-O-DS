package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeroFixo = 7;
		int numeroInformado;
		
		do {
			System.out.print("Informe um número: ");
			numeroInformado = leia.nextInt();
		} while(numeroInformado <= 0);
		
		for(int i = 1;i <= 10; i++) {
			System.out.println(numeroInformado + " x " + i +" = " + numeroInformado*i);
		}
		
		leia.close();
	}

}
