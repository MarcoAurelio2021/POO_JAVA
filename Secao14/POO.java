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

        // Override
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);
        System.out.println(q1.calcularArea());
        System.out.println(c1.calcularArea());
        

        // Super
        // O super é usado para acessar os atributos da classe pai
        // O super é usado para chamar os métodos da classe pai
        // O super é usado para chamar o construtor da classe pai

        Funcionario funcionario = new Funcionario("Carlos", 1500);
        Gerente gerente = new Gerente("Marco Aurélio", 5000, 1300);

        funcionario.exibirDetalhes();
        gerente.exibirDetalhes();

        System.out.println(gerente.calcularBonus());
    }

}
