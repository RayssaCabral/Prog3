import java.util.Scanner;
import java.text.DecimalFormat;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média das notas: " + df.format(media));
        sc.close();
    }
}
