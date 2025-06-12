import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
                    int tipo = sc.nextInt();
                    sc.nextLine(); // limpar buffer

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();

                    if (tipo == 1) {
                        System.out.print("Qtd de portas: ");
                        int portas = sc.nextInt();
                        veiculos.add(new Carro(modelo, placa, ano, portas));
                    } else if (tipo == 2) {
                        System.out.print("Cilindrada: ");
                        int cilindrada = sc.nextInt();
                        veiculos.add(new Moto(modelo, placa, ano, cilindrada));
                    } else if (tipo == 3) {
                        System.out.print("Capacidade de carga (toneladas): ");
                        double carga = sc.nextDouble();
                        veiculos.add(new Caminhao(modelo, placa, ano, carga));
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de Veículos ---");
                    for (Veiculo v : veiculos) {
                        v.exibirDados(); // Polimorfismo em ação
                    }
                    System.out.println("-------------------------\n");
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
