public class Veiculo {
    
        String marca;
        String modelo;
        int ano;

        Veiculo(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        void exibirDados() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
        }
    }