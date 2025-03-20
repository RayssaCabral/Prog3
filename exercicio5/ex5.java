//5
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota:");
        double nota = scanner.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida.");
        } else {

            int conceito = (int) nota;

            switch (conceito) {
                case 9:
                case 10:
                    System.out.println("Conceito: A");
                    break;
                case 7:
                case 8:
                    System.out.println("Conceito: B");
                    break;
                case 5:
                case 6:
                    System.out.println("Conceito: C");
                    break;
                case 3:
                case 4:
                    System.out.println("Conceito: D");
                    break;
                case 0:
                case 1:
                case 2:
                    System.out.println("Conceito: E");
                    break;
                default:
                    System.out.println("Nota inválida.");
            }
        }
        scanner.close();
    }
}