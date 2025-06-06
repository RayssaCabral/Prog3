public class CartaoCredito implements Pagamento{

    public void realizarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado com cartao de credito.%n", valor);
    }
}
