static class Moto extends Veiculo {
        int cilindradas;

        Moto(String marca, String modelo, int ano, int cilindradas) {
            super(marca, modelo, ano);
            this.cilindradas = cilindradas;
        }

        void exibirDados() {
            super.exibirDados();
            System.out.println("Cilindradas: " + cilindradas);
        }
    }

