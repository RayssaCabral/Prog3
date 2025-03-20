import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em reais:");
        double Reais = scanner.nextDouble();

        double cotacao = Reais / 5;

        System.out.println("o valor da conversão de reais para dolares é:" + cotacao + " (US$) aproximadamente");
        scanner.close();
    }
}
