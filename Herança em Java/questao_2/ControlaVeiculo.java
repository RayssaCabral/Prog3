public class ControlaVeiculo{
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", "Sedan", 2019, 2);
        Moto moto = new Moto("Kawasaki", "S600", 2019, 600);

        System.out.println("Carro:");
        carro.exibirDados();

        System.out.println("\nMoto:");
        moto.exibirDados();
    }
}        
        
