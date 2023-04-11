package entrada_e_saida_de_dados;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
		int idade; // numero inteiro
		char a;
		String nome = "Sabado";
		System.out.println("Meu nome é " + nome);
		

		System.out.println("Qual o seu nome?");
		try (Scanner leitor = new Scanner(System.in)) {
			nome = leitor.next();
		}
		System.out.println("Seu nome é: " + nome);
	}
}
