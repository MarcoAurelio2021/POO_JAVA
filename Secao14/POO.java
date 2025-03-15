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


        // Classe Abstrata
        // Uma classe abstrata não pode ser instanciada
        // Uma classe abstrata pode ter métodos abstratos
        // Uma classe abstrata pode ter métodos concretos
        // Uma classe abstrata pode ter atributos
        // Uma classe abstrata pode ter construtores
        // Há uma diferença na hora de fazer as invocações;

        instrumentoMusical violao = new Violao("Violão");
        instrumentoMusical bateria = new Bateria("Bateria");

        violao.exibirDetalhes();
        violao.tocar();

        bateria.exibirDetalhes();
        bateria.tocar();

        // interfaces
        // Necessário tipar elas, semelhante a classe abstrata
        // Uma interface não pode ter atributos
        // Uma interface não pode ter construtores
        // Dês de JAVA 8 as interfaces podem ter métodos concretos com o uso do default
        // Uma interface pode ter métodos abstratos

        Pagamento cartao = new cartaoCredito();
        Pagamento transBanc = new transferenciaBancaria();

        cartao.processarPagamento(200);
        cartao.imprimirRecibo(200);

        transBanc.processarPagamento(320);
        transBanc.imprimirRecibo(320);

        // Multiplas interfaces
        // Uma classe pode implementar várias interfaces
        // Uma interface pode herdar de outra interface
        // Ao usar multiplas interfaces, podemos usar a propria  classe como tipo do objeto;

        // testar idade
        verificarIdade(27);
    }

    public static void verificarIdade (int idade) {
   
        if (idade < 18)
        {
           System.out.println("Menor de idade");
        } else if (idade >= 18 && idade <= 64) {
           System.out.println("Adulto");
        } else if (idade > 65) {
           System.out.println("Idoso");
        }
            
       }
       

}
