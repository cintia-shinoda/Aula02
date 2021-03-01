import java.util.Scanner;

public class DesvioComposto {

	public static void main(String[] args) {
		/* O estatuto de uma ONG determina que todas as doações recebidas devem gerar um valor para investimento, para cobrir momentos de necessidade. 
		 * O valor do investimento deve ser de 5% da doação. Porém, em casos em que as doações ultrapassem R$ 1000,00, o investimento deve ser de 15% da doação.
		 * Sua missão é criar um programa capaz de fazer os cálculos necessários e indicar quanto deve ser investido. */
		
		Scanner leitor = new Scanner(System.in);
		double doacao, investimento, usoImediato;
		investimento = 0;
		usoImediato = 0;
		System.out.println("Por favor, digite o valor da doação recebida:");
		doacao = leitor.nextDouble();

		/* O if abaixo tem uma parte verdadeira e outra falsa.
		Caso a resposta do teste seja verdadeira, a primeira parte é executada.
		Caso contrário, a segunda parte é executada. */
		if (doacao < 1000) {
			// Verdadeira
			investimento = doacao * 0.05;
			usoImediato = doacao - investimento;
		} else {
			// Falsa
			investimento = doacao * 0.15;
			usoImediato = doacao - investimento;
		}
		
		
		System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato + " para uso imediato.");
		
		leitor.close();

	}

}
