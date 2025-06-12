public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String modelo, String placa, int ano, double capacidadeCarga) {
        super(modelo, placa, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDados() {
        System.out.println("Caminhão - Modelo: " + modelo + " | Placa: " + placa + " | Ano: " + ano + " | Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}
