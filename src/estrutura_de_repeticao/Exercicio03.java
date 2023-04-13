package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int entrada;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número:");
		entrada = leitor.nextInt();
		if (entrada <= 0) {
			System.out.println("menor ou igual a zero!");
			return;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(entrada);
			System.out.print(" x ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println( entrada*i);
		}
	}
}
