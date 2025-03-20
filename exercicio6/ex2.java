import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Insira um número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while (i<=10) {
            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }
    }
}
