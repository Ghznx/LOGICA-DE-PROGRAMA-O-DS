package exercicios;

public class exercicio9 {

	public static void main(String[] args) {
		
		double rendimentoC = 3000.00;
		double rendimentoJ = 1000.00;
		int quantidadeMeses = 0;
		
		do {
			rendimentoJ = rendimentoJ * 1.05;
			rendimentoC = rendimentoC * 1.02;
			quantidadeMeses++;
		} while(rendimentoJ < rendimentoC);
		
		System.out.println("Quantidade de meses necessários: "+ quantidadeMeses);
		System.out.println("Valor acumulado por Carlos: "+ rendimentoC);
		System.out.println("Valor acumulado por João: "+ rendimentoJ);
	}

}
