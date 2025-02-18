package Secao12;

import Secao13.Pessoa;

public class POO {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Pessoa p1 = new Pessoa();

        carro1.marca = "Honda";
        carro1.modelo = "Civic";
        carro1.anoDeFabricacao= 2015;

        carro1.exibirInfo();
          
        carro1.ligarMotor();
        carro1.ligarMotor();
        carro1.aumentarVelocidade(30);

        // Atribuindo valores a peopiedade pelo método Set();
        // Imprimindo valor pelo método get();
        
        p1.setNome("Marco Aurélio");
        System.out.println(p1.getNome());

        p1.setIdade(27);
        System.out.println(p1.getIdade());
    }
}
