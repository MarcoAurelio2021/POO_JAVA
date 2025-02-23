package Secao14;

public class Motor {
    private String tipo;
    private String potencia;

    // Construtor
    public Motor(String tipo, String potencia) { 
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void exibirInfo () {
        System.out.println("Tipo: " + this.tipo + "\nPotência: " + potencia + " CV");
    }
}
