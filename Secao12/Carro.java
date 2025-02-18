package Secao12;
// Sintaxe para criar uma classe
// public class NomeDaClasse {}
public class Carro {
    // Atributos da classe
    public String marca;
    public String modelo;
    public int anoDeFabricacao;

    double velocidadeAtual = 0;
    boolean motorLigado = false;

    
    // Métodos
    // Se não utilizar o public, ele vem como padrão Defaul;
    // As funções são chamadas pelo nome(), enquanto os métodos são chamados pelo Objeto.Método();
     void Acelerar() {
        System.out.println("O carro está acelerando");
    }

     void Frear () {
        System.out.println("O carro está Parando");
    }

    void exibirInfo () {
        System.out.println("O carro é um " + marca + ", modelo " + modelo + ", ano: " + anoDeFabricacao);
    }

    void ligarMotor() {
        // motorLigado que está como false, negando ele na condição ele passa a ser verdadeiro e entra no bloco de código
        // logo motorLigado recebe true, quando eu chamar o método no main novamente ele irá dizer que o motor já está ligado, pois a condição não é atendida e entra no bloco de código Else {};
        if (motorLigado) {
            motorLigado = true;
            System.out.println("Ligando o motor");

        } else {
            System.out.println("O motor ja está ligado");
        }

        
    }

    void aumentarVelocidade(double incremento) {
        if (motorLigado) {
            velocidadeAtual += incremento;
            System.out.println("A velocidade do carro aumentou para " + velocidadeAtual);
        } else {
            System.out.println("É preciso ligar o motor.");
        }
    
}
}
