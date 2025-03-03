package Secao14;
public class POO {
    public static void main(String[] args) {
        // Criando o motor
        Motor motor = new Motor("V/8", "100");
        Carro carro = new Carro("Chefrolet", "Opala", motor);
        carro.exibirInfo();


        // Herança
        Cachorro pitbull = new Cachorro("Duque");

        
        pitbull.latir();
        pitbull.EmitirSom();


        // Classe Object
        // O Object é pai de todas as classes, logo todas as classes herdam o Object
        Pessoa marcoAurelio = new Pessoa("Marco Aurélio", 27);
        Pessoa larissa = new Pessoa("Larissa", 23);

        System.out.println(marcoAurelio.toString());
        System.out.println(marcoAurelio.equals(larissa));
    }
}
