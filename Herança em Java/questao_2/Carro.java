static class Carro extends Veiculo {
        int quantidadePortas;

        Carro(String marca, String modelo, int ano, int quantidadePortas) {
            super(marca, modelo, ano);
            this.quantidadePortas = quantidadePortas;
        }

        void exibirDados() {
            super.exibirDados();
            System.out.println("Quantidade de Portas: " + quantidadePortas);
        }
    }