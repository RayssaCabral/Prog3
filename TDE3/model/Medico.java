package model;

public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, String cpf, String especialidade) {
        super(nome, cpf);
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Médico: " + nome + " | CPF: " + cpf + " | Especialidade: " + especialidade);
    }
}
