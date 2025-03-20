//4
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano:");
        int ano = scanner.nextInt();

        if (ano % 4 == 0 && (ano% 100 != 0 || ano% 400 == 0)) {
            System.out.println("O ano é Bissexto!");
        }else{
            System.out.println("O ano Não é Bissexto!");

        }
        scanner.close();

    }
}