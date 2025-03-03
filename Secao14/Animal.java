package Secao14;

public class Animal {

    protected String nome;

    public Animal (String nome) {
        this.nome = nome;
    }

    // Metódo 
    public void EmitirSom() {
        System.out.println(nome + " Está emitindo um som");
    } 
}
