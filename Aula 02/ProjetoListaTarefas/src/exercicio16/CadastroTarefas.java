package exercicio16;

import java.util.ArrayList;

import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		ArrayList<String> tarefas = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		String tarefa;
		String resposta;
		
		do {
			System.out.print("Digite uma tarefa: ");
			tarefa = sc.nextLine();
			tarefas.add(tarefa);
			
			System.out.print("Deseja cadastrar outra tarefa? ");
			resposta = sc.nextLine();
		} while(resposta == "s");
		
		System.out.println("Tarefas Cadastradas: ");
		
		for(String t: tarefas) {
			System.out.println(t);
		}
		
		sc.close();
	}

}
