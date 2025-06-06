    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Smartphone smartphone = new Smartphone();
            Televisao televisao = new Televisao();

            System.out.println("Escolha um dispositivo:");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Televisão");
            int dispositivo = scanner.nextInt();

            System.out.println("O que deseja fazer?");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            int acao = scanner.nextInt();

            switch (dispositivo) {
                case 1:
                    if (acao == 1) {
                        smartphone.ligar();
                    } else {
                        smartphone.desligar();
                    }
                    break;
                case 2:
                    if (acao == 1) {
                        televisao.ligar();
                    } else {
                        televisao.desligar();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            scanner.close();
        }
    }
