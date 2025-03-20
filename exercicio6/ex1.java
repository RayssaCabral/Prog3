import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Insira um número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0 ;
        for(int i = 0; i < num; i++)
            count = count + i;
        System.out.println(count);
    }
}
