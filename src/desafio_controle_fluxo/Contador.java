package desafio_controle_fluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try {
				
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException exception) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for(int contador = contagem; contador > 0; contador--) {
			System.out.println("Imprimindo numero " + contador);
		}
		
	}
}
