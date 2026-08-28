package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = leia.nextInt();
		
		if(numero > 20)	{
			System.out.println("O valor desse número é maior que 20!!");
		} else {
			System.out.println("Não é maior que 20!");
		}
		
        leia.close();
	}

}
