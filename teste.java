
import java.util.ArrayList;
import java.util.Arrays;

public class teste {
    public static void main(String[] args) {
        int [] resultado = gerarFibonacci(10);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] gerarFibonacci(int n) {
        int[] fibonacci = new int[n];
        
        if (n > 0) {
            fibonacci[0] = 0;  // Primeiro número da sequência é 0
        }
        if (n > 1) {
            fibonacci[1] = 1;  // Segundo número da sequência é 1
        }
        
        // Laço para gerar os próximos números da sequência
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        return fibonacci;
    }
}
