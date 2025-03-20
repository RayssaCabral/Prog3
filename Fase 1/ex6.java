import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Digite o valor do desconto do INSS: ");
        double descontoINSS = scanner.nextDouble();

        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Salário líquido: R$ "+ salarioLiquido);
        scanner.close();
    }
}
