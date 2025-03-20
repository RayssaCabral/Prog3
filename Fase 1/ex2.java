import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        final double PI = 3.14159;

        double area = PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo com raio %.2f é: %.4f\n", raio, area);
        scanner.close();
    }
}
