import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área do retângulo: %.2f\n"+ area);
        System.out.println("Perímetro do retângulo: %.2f\n"+ perimetro);
        scanner.close();

    }
}
