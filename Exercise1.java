import java.util.ArrayList;

public class Exercise1 {
     public static void main(String[] args) {
       // Exercise exercicio = new Exercise();
        int n = 6;
        ArrayList<Integer> fibonacci = new ArrayList();
        fibonacci = gerarFibonacci(n);
        
        // Imprime o resultado
        System.out.println(fibonacci.toString()); // Saída esperada: [0, 1, 1, 2, 3, 5]
    }
    
    public static ArrayList<Integer> gerarFibonacci (int n) {
        ArrayList<Integer> fibonacci = new ArrayList();
        
        // Verifica se n é maior que 0
        if (n > 0) {
            fibonacci.add(0); // O primeiro número da sequência é 0
        }
        if (n > 1) {
            fibonacci.add(1); // O segundo número da sequência é 1
        }
        
        // Preenche o resto da sequência
        for (int i = 2; i < n; i++) {
            int nextFib = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(nextFib);
        }
        
        return fibonacci;
    }

}
