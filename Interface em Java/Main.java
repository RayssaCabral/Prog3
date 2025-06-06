public class Main {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new BoletoBancario();

        cartao.realizarPagamento(299.91);
        boleto.realizarPagamento(345.67);

    }
}
