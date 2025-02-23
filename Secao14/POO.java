package Secao14;

public class POO {
    public static void main(String[] args) {
        // Criando o motor
        Motor motor = new Motor("V/8", "100");
        Carro carro = new Carro("Chefrolet", "Opala", motor);
        carro.exibirInfo();
    }
}
