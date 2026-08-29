package exercicio11;

public class ListaCidades {

	public static void main(String[] args) {
		String[] cidades = {"Valença","Barra do Piraí","Vassouras","Volta Redonda","Resende"};
		
		for(int i = 0; i < 5;i++) {
			System.out.println("Cidade da posição "+ (i+1) + " "+ cidades[i]);
		}

	}

}
