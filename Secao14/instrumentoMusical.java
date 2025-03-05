package Secao14;
// Classes abstratas não pode ser instanciada;
 abstract class instrumentoMusical {
    protected String nome;

    public instrumentoMusical (String nome) {
        this.nome = nome;
    }
    // Método Abstrato
    // O método abstrato deve ser implementado na classe que for herda-lo;
    public abstract void tocar ();

    // Método concreto
    // O método concreto pode ser chamado diretamente da classe que o possui;
    // Pode ser sobrescrito na classe filha

    public void exibirDetalhes () {
        System.out.println("Instrumento: " + nome);
    }

}
