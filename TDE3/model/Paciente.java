package model;

public class Paciente extends Pessoa {
    private String endereco;

    public Paciente(String nome, String cpf, String endereco) {
        super(nome, cpf);
        this.endereco = endereco;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Paciente: " + nome + " | CPF: " + cpf + " | Endereço: " + endereco);
    }
}
