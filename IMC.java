import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        double peso;
        double altura;

       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso (em kg):");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura (em metros):");
        altura = sc.nextDouble();
        // System.out.println();

        System.out.println(peso);
        System.out.println(altura);

        System.out.println("Calc:" + peso / (altura * altura));

        System.out.println("Resultado:\n");


        if (calcularImc(peso, altura) < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (calcularImc(peso, altura) >= 18.5 && calcularImc(peso, altura) <= 24.9) {
            System.out.println("Você está no peso ideal");
        } else if (calcularImc(peso, altura) >= 25){
            System.out.println("Sobrepeso");
        }
        sc.close();
    }

    static final double calcularImc (double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }
}
