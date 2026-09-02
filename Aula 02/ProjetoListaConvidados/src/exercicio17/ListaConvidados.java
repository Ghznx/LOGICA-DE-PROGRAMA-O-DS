package exercicio17;

import java.util.ArrayList;

import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
        ArrayList<String> convidados = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String opcao;
		String convidado;
		int posicao;
		String novoNome;
		
		do {
			System.out.println("1 - Adicionar convidado");
			System.out.println("2 - Alterar convidado");
			System.out.println("3 - Remover convidado");
			System.out.println("4 - Procurar convidado");
			System.out.println("5 - Exibir convidados");
			System.out.println("6 - Encerrar");
			
			System.out.print("Informe a opção desejada: ");
			opcao = sc.nextLine();
			
			switch(opcao) {
				case "1":
					System.out.print("Convidado adicionado: ");
					convidado = sc.nextLine();
					convidados.add(convidado);
					break;
				case "2":
					System.out.print("Posição do convidado alterado: ");
					posicao = Integer.parseInt(sc.nextLine());
					System.out.print("Novo nome: ");
					novoNome = sc.nextLine();
					if(posicao <= convidados.size()) {
						convidados.set(posicao, novoNome);
					} else {
						System.out.println("Posição invalida");
					}
					break;
				case "3":
					System.out.print("Informe o nome para ser verificado: ");
					convidado = sc.nextLine();
					System.out.println(convidados.contains(convidado));
					if(convidados.contains(convidado) == true) {
						convidados.remove(convidado);
					}
					break;
				case "4":
					System.out.print("Informe um nome: ");
					convidado = sc.nextLine();
					System.out.println("Posição: "+ convidados.indexOf(convidado));
					break;
				case "5":
					System.out.println("Convidados: ");
					for(String c: convidados) {
						System.out.println(c);
					}
					break;
				case "6":
					System.out.println("Programa encerrado!!");
					break;
			}
		} while(opcao != "6");
		sc.close();
	}

}
