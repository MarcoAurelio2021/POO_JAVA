package Secao12;

import java.util.Arrays;

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

        // Encapsulamento de Arrays;
        // Exemplo de encapsulamento de arrays;

        String [] meusAlunos = {"Mateus", "João"};
        Turma novaTurma = new Turma(meusAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));

        // Atualizando valor do Array
        // É preciso criar um array  que receba os valores e depois passar como paâmetro para o Setter; ]
        String [] novosAlunos = {"gvrf", ",u"};
        
        novaTurma.setTurma(novosAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));
    } 
}
