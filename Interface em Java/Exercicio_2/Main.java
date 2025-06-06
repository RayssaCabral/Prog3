import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo:");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double altura = scanner.nextDouble();
        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();
        Circulo circulo = new Circulo(raio);

        System.out.println("\n--- Resultados ---");
        System.out.printf("Retângulo (Largura=%.2f, Altura=%.2f):\n", largura, altura);
        System.out.printf("  Área: %.2f\n", retangulo.calcularArea());
        System.out.printf("  Perímetro: %.2f\n", retangulo.calcularPerimetro());

        System.out.printf("\nCírculo (Raio=%.2f):\n", raio);
        System.out.printf("  Área: %.2f\n", circulo.calcularArea());
        System.out.printf("  Perímetro (Circunferência): %.2f\n", circulo.calcularPerimetro());

        scanner.close();
    }
}
