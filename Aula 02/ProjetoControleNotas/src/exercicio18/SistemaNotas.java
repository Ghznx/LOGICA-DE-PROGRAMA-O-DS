package exercicio18;

import java.util.ArrayList;

import java.util.Scanner;

public class SistemaNotas {

	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		String aluno;
		double nota;
		double novaNota;
		int posicao;
		double soma = 0;
		double maior;
		double menor;
		String resposta;
		
		do {
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Listar alunos");
			System.out.println("3 - Procurar aluno");
			System.out.println("4 - Alterar nota");
			System.out.println("5 - Remover aluno");
			System.out.println("6 - Exibir média da turma");
			System.out.println("7 - Exibir maior e menor nota");
			System.out.println("8 - Exibir situação dos alunos");
			System.out.println("9 - Encerrar");
			
			System.out.print("Informe a opção desejada: ");
			opcao = Integer.parseInt(sc.nextLine());
			
			switch(opcao) {
				case 1:
					System.out.print("Aluno adicionado: ");
					aluno = sc.nextLine();
					alunos.add(aluno);
					System.out.print("Nota adicionada: ");
					nota = Double.parseDouble(sc.nextLine());
					notas.add(nota);
					break;
				case 2:
					System.out.println("Alunos: ");
					for(int i = 0;i < alunos.size();i++) {
						System.out.println("Posição "+ i + " - "+ alunos.get(i) + " - "+ "Nota: "+ notas.get(i));
					}
					break;
				case 3:
					System.out.print("Informe um nome: ");
					aluno = sc.nextLine();
					if(aluno.indexOf(aluno) == -1) {
						System.out.println("Aluno nao encontrado");
					} else {
						System.out.println("Posição: "+ alunos.indexOf(aluno));
					}
					break;
				case 4:
					System.out.print("Nome do aluno: ");
					aluno = sc.nextLine();
					posicao = aluno.indexOf(aluno);
					System.out.print("Nova nota: ");
					novaNota = Double.parseDouble(sc.nextLine());
					notas.set(posicao, novaNota);
					break;
				case 5:
					System.out.print("Nome do aluno: ");
					aluno = sc.nextLine();
					posicao = aluno.indexOf(aluno);
					alunos.remove(posicao);
					notas.remove(posicao);
					break;
				case 6:
					for(int i = 0;i < notas.size();i++) {
						soma += notas.get(i);
					}
					System.out.println("Média da turma: "+ (soma/notas.size()));
					break;
				case 7:
					maior = notas.get(0);
					menor = notas.get(0);
					for(int i = 0;i < notas.size();i++) {
						if(maior < notas.get(i)) {
							maior = notas.get(i);
						}
						if(menor > notas.get(i)) {
							menor = notas.get(i);
						}
					}
					System.out.println("Maior nota: "+ maior);
					System.out.println("Menor nota: "+ menor);
					break;
				case 8:
					for(int i = 0;i < alunos.size();i++) {
						System.out.print(alunos.get(i));
						if(notas.get(i) >= 7) {
							System.out.println(": Aprovado!");
						} else if(notas.get(i) < 5) {
							System.out.println(": Reprovado!");
						} else {
							System.out.println(": Recuperação!");
						}
					}
					break;
				case 9:
					System.out.print("Deseja realmente encerrar e apagar os dados(Sim/Nao)? ");
					resposta = sc.nextLine();
					if(resposta == "Sim") {
						alunos.clear();
						notas.clear();
						
						System.out.println("Programa encerrado e dados apagados!!");
					} else {
						System.out.println("Programa encerrado!!");
					}
					break;
			}
		} while(opcao != 9);
		
		
		sc.close();
	}

}
