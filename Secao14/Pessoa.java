package Secao14;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // Sobrescrita
    // É Possivel reescrever os métodos da Classe Object, mas não é recomendado;
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
