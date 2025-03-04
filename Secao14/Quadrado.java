package Secao14;

public class Quadrado extends Forma{
    private double lado;

    public Quadrado (double lado) {
        this.lado = lado;
    }

    // A Sobrescrita, respeita tipo de retorno, nome e argumentos do método; 
@Override
public double calcularArea () {
return Math.pow(lado, 2);
}
}
