//2
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade:");
        int idade = scanner.nextInt();

        if(idade < 18) {
            System.out.println("Menor de idade");

        }else if(idade >=18 && idade <=60) {
            System.out.println("Adulto");
        }else{
            System.out.println ("idoso");
        }
        scanner.close();
    }
}