package controller;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ConsultaController {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();

    public void cadastrarPaciente(String nome, String cpf, String endereco) throws CampoObrigatorioException {
        if (nome.isEmpty()) throw new CampoObrigatorioException("Nome do paciente");
        if (cpf.isEmpty()) throw new CampoObrigatorioException("CPF do paciente");
        if (endereco.isEmpty()) throw new CampoObrigatorioException("Endereço");

        pacientes.add(new Paciente(nome, cpf, endereco));
    }

    public void cadastrarMedico(String nome, String cpf, String especialidade) throws CampoObrigatorioException {
        if (nome.isEmpty()) throw new CampoObrigatorioException("Nome do médico");
        if (cpf.isEmpty()) throw new CampoObrigatorioException("CPF do médico");
        if (especialidade.isEmpty()) throw new CampoObrigatorioException("Especialidade");

        medicos.add(new Medico(nome, cpf, especialidade));
    }

    public void agendarConsulta(String nomePaciente, String nomeMedico, LocalDate data) throws Exception {
        Paciente paciente = buscarPacientePorNome(nomePaciente);
        Medico medico = buscarMedicoPorNome(nomeMedico);

        consultas.add(new Consulta(paciente, medico, data));
    }

    public void listarConsultas() {
        for (Consulta consulta : consultas) {
            consulta.exibirInformacoes();
        }
    }

    public Consulta buscarConsultaPorPaciente(String nome) throws ConsultaNaoEncontradaException {
        for (Consulta consulta : consultas) {
            if (consulta.getPaciente().getNome().equalsIgnoreCase(nome)) {
                return consulta;
            }
        }
        throw new ConsultaNaoEncontradaException("Consulta não encontrada para o paciente: " + nome);
    }

    public void cancelarConsulta(String nomePaciente) throws ConsultaNaoEncontradaException {
        Consulta consulta = buscarConsultaPorPaciente(nomePaciente);
        consultas.remove(consulta);
    }

    private Paciente buscarPacientePorNome(String nome) throws Exception {
        return pacientes.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new Exception("Paciente não encontrado"));
    }

    private Medico buscarMedicoPorNome(String nome) throws Exception {
        return medicos.stream()
                .filter(m -> m.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new Exception("Médico não encontrado"));
    }
}
