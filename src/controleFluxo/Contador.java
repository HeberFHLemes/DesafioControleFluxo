package controleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		// Ler inputs do usuário para os dois parâmetros (inteiros)
		try (Scanner terminal = new Scanner(System.in)){
		
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();		
			
			// Executar método contar() ou lançar exceção ParametrosInvalidosException
			try {
				contar(parametroUm, parametroDois);
			} catch (ParametrosInvalidosException e) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro. ");
			}
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// Verificar exceção -> se o segundo parâmetro for maior que o primeiro.
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		// Contagem de ocorrências no loop for;
		int contagem = parametroDois - parametroUm;
			
		// Imprimir os números de 1 até 'contagem'.
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}

}