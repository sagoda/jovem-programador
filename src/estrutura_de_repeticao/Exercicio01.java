package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int operacao;
		Scanner leitor = new Scanner(System.in);
		do {
			System.out.println(
					"""
					1) Adição
					2) Subtração
					3) Divisão
					4) Multiplicação
					0) Sair
					Digite o número da operação desejada:
					""");
			operacao = leitor.nextInt();
			
        } while (operacao != 0);
	}
}
