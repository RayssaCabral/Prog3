import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Números primos no intervalo de " + num1 + " a " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
    public static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
