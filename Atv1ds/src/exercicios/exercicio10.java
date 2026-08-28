package exercicios;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double salario;
		int opc;
		
		do {
			System.out.println("1 - Calcular o imposto sobre o salário: ");
			System.out.println("2 - Calcular o novo salário após um aumento: ");
			System.out.println("3 - Mostrar a classificação do salário: ");
			System.out.println("4 - Finalizar o programa: ");
			
			System.out.print("Informe a opção desejada: ");
			opc = leia.nextInt();
			
			switch(opc) {
			case 1:
				System.out.print("Informe o seu salário: ");
				salario = leia.nextInt();
				if(salario < 500.00) {
					salario = salario -(salario * 0.05);
					System.out.println("Salário com imposto: "+ salario);
				} else if(salario < 850.00) {
					salario = salario -(salario * 0.10);
					System.out.println("Salário com imposto: "+ salario);
				} else {
					salario = salario -(salario * 0.15);
					System.out.println("Salário com imposto: "+ salario);
				}
				break;
			case 2:
				System.out.print("Informe o seu salário: ");
				salario = leia.nextInt();
				if(salario > 1500.00) {
					salario = salario + 250.00;
					System.out.println("Novo salário: "+ salario);
				} else if(salario > 750) {
					salario = salario + 50.00;
					System.out.println("Novo salário: "+ salario);
				} else if(salario > 450){
					salario = salario + 75.00;
					System.out.println("Novo salário: "+ salario);
				} else {
					salario = salario + 100.00;
					System.out.println("Novo salário: "+ salario);
				}
				break;
			case 3:
				System.out.print("Informe o seu salário: ");
				salario = leia.nextInt();
				
				if(salario < 700) {
					System.out.println("Mal remunerado! ");
				} else {
					System.out.println("Bem remunerado! ");
				}
				break;
			case 4:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção invalida");
			} 
		} while(opc != 4);
		leia.close();
	}

}
