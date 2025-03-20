package Secao15;

public class Erros {
    public  static void main(String[] args) {
        // 1- try catch
        // Usando o try catch a execução do código  não é interrompida diretamente,
        // mas sim continua após o tratamento do erro.
        // retornando uma mensagem de erro para o usuário
        // Excessão e erro: palavras para o mesmo fim;
        try {
            int a = 0;
            int b = 10;
            int resultado = b / a;
        } catch (ArithmeticException e) {
            System.out.println("A divisão por 0, não é possível");
        }

        try {
            int [] numeros = {1,2,3};
            System.out.println(numeros[3]);
        } catch (Exception e) {
            System.out.println("Erro genárico");
            System.out.println("Msg: " + e.getMessage());
        }
    }
}
