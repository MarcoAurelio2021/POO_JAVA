import java.util.Scanner; 

public class calculadoraSimples {

    // Calculadora Simples
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1, num2;
        
       System.out.println("Digite o primeiro numero"); 
       num1 = ler.nextDouble();
       System.out.println("Digite o segundo numero");
       num2 = ler.nextDouble();
       ler.nextLine();

       System.out.println("Escolha uma operação:\n");
       System.out.println("1- Soma");
       System.out.println("2 - Subtração");
       System.out.println("3 - Multiplicação");
       System.out.println("4 - Divisão");
       String op = ler.nextLine();

       calcular(num1, num2, op);
    }

    // Funcão calcular

    public static double resultado;


    public static void calcular(double num1, double num2, String operador) {
        

        switch (operador) {
            case "+":
            resultado = num1 + num2;
            break;
            case "-":
            resultado = num1 - num2;
            break;
            case "*":
            resultado = num1 * num2;
            break;
            case "/":
            resultado = num1 / num2;
            break;
            default: System.out.println("Valor invalido");
        }
        
        System.out.println(resultado);
        }
    }

