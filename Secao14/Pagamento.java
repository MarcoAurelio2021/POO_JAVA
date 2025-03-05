package Secao14;

 interface Pagamento {
    // Método abstrato
    void processarPagamento(double valor);

    // Método com default
    default void imprimirRecibo(double valor) {
        System.out.println("Valor do recibo: " + valor);
    }}
