import java.util.Scanner;

public class ex3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a temperatura em celsius: ");
            double celsius = sc.nextDouble();

            double f = (celsius)* (9.0 / 5.0) + (32);

            System.out.println("A temperatura em Fahrenheit é: " + f);
        }
}
