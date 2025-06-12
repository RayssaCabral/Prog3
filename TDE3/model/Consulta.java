package model;

import java.time.LocalDate;

public class Consulta implements Exibivel {
    private Paciente paciente;
    private Medico medico;
    private LocalDate data;

    public Consulta(Paciente paciente, Medico medico, LocalDate data) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Consulta - Paciente: " + paciente.getNome()
                + " | Médico: " + medico.getNome()
                + " | Data: " + data);
    }
}
