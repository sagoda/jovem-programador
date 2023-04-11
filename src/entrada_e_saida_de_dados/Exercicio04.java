package entrada_e_saida_de_dados;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        int fahrenheit;
        System.out.println("Digite uma temperatura em Fahrenheit:");
        try (Scanner leitor = new Scanner(System.in)) {
            fahrenheit = leitor.nextInt();
        }
        System.out.println(
            "A temperatura digitada foi "
            + fahrenheit
            + " fahrenheit");
        
        int celsius = ((fahrenheit-32)*5)/9;
        System.out.println(
            "A temperatura convertida é "
            + celsius
            + " celsius");
    }
}
