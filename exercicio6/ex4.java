import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("Insira a quantidade de alunos");
        Scanner sc = new Scanner(System.in);

        int numAlunos = sc.nextInt();
        float notasCounter = 0;
        System.out.println("Insira a nota dos alunos");
        for(int i = 0; i < numAlunos; i++){
            System.out.println("Aluno " + (i+1));
            float nota = sc.nextFloat();
            notasCounter = notasCounter + nota;
        }
        System.out.println("A média da turma é: " + notasCounter/numAlunos);
    }
}
