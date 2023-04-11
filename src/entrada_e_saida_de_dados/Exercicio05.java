package entrada_e_saida_de_dados;


import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso;
		double altura;
		
		Scanner leitorDoTeclado = new Scanner(System.in);
		
		System.out.println("Digite o seu peso em kg:");
		peso = leitorDoTeclado.nextDouble();
		
		System.out.println(
	        "O peso digitado foi "
	        + peso
	        + " kg");

		
		System.out.println("Digite a sua altura em metros:");
		altura = leitorDoTeclado.nextDouble();
		
		System.out.println(
	        "A altura digitada foi "
	        + altura
	        + " metros");
		
		double imc = peso / (altura * altura);
		
		System.out.println("O IMC é: " + imc);
	}
}
