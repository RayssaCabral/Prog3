public class ControlaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria", 5000);
        Gerente gerente = new Gerente("Anderson", 10000);
        Estagiario estagiario = new Estagiario("Ana", 4000);

        System.out.println("Nome: " + funcionario.getNome() + " | Salário final: " + funcionario.calcularSalario());
        System.out.println("Nome: " + estagiario.getNome() + " | Salário final: " + estagiario.calcularSalario());
        System.out.println("Nome: " + gerente.getNome() + " | Salário final: " + gerente.calcularSalario());
    }
}
