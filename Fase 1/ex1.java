import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor1 = Scanner.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        int valor2 = Scanner.nextInt();

        int soma = valor1 + valor2;

        System.out.println("A soma dos valores: " + soma);
        Scanner.close();
    }
}
