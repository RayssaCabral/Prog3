import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:");
        int num = sc.nextInt();
        do {
            System.out.println(num);
            num--;
        } while (num > 0);
    }
}
