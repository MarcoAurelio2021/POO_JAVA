package Secao14;

public class cartaoCredito implements Pagamento{
    @Override
    public void processarPagamento  (double valor) {
        System.out.println("Pagamento realizado com cartão de crédito de: " + "R$" + valor );
    }
}
