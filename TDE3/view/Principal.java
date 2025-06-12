package view;

import controller.ConsultaController;
import model.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaController controller = new ConsultaController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Cadastrar Médico");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. Listar Consultas");
            System.out.println("5. Buscar Consulta por Paciente");
            System.out.println("6. Cancelar Consulta");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            String opcao = scanner.nextLine();

            try {
                switch (opcao) {
                    case "1" -> {
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = scanner.nextLine();
                        controller.cadastrarPaciente(nome, cpf, endereco);
                        System.out.println("Paciente cadastrado!");
                    }
                    case "2" -> {
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        System.out.print("Especialidade: ");
                        String esp = scanner.nextLine();
                        controller.cadastrarMedico(nome, cpf, esp);
                        System.out.println("Médico cadastrado!");
                    }
                    case "3" -> {
                        System.out.print("Nome do Paciente: ");
                        String nomePaciente = scanner.nextLine();
                        System.out.print("Nome do Médico: ");
                        String nomeMedico = scanner.nextLine();
                        System.out.print("Data da consulta (YYYY-MM-DD): ");
                        LocalDate data = LocalDate.parse(scanner.nextLine());
                        controller.agendarConsulta(nomePaciente, nomeMedico, data);
                        System.out.println("Consulta agendada!");
                    }
                    case "4" -> controller.listarConsultas();
                    case "5" -> {
                        System.out.print("Nome do paciente: ");
                        String nome = scanner.nextLine();
                        Consulta consulta = controller.buscarConsultaPorPaciente(nome);
                        consulta.exibirInformacoes();
                    }
                    case "6" -> {
                        System.out.print("Nome do paciente: ");
                        String nome = scanner.nextLine();
                        controller.cancelarConsulta(nome);
                        System.out.println("Consulta cancelada.");
                    }
                    case "0" -> {
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
