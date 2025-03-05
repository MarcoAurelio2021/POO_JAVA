package Secao14;

public class transferenciaBancaria implements Pagamento{
    public void processarPagamento (double valor) {
        System.out.println("Processando transferência bancária de R$ " + valor);
    }

    @Override
    public void imprimirRecibo (double valor)  {
        System.out.println("Detalhes da transferência bancária: R$ " + valor);
    }
}
