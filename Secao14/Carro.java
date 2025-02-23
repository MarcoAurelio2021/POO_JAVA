package Secao14;


public class Carro {

    private String marca;
    private String modelo;
    private Motor motor;

    // construtor 
    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        // Propriedade Object Composition
        this.motor = motor;
    }

    public void exibirInfo () {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
        motor.exibirInfo();
    }
}
