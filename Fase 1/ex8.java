import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        System.out.printf("O volume da esfera com raio %.2f é: %.2f\n", raio, volume);
        scanner.close();
    }
}
