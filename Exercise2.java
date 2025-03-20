public class Exercise2 {
    public static void main(String[] args) {
        // Imprimir numero mais frequente
        int[] numeros = {1,2,3,4,2,2,6,6,6,6};
        int numeroMaisFrequente = numeros[0];
        
        int maxContagem = 1;
       

            for (int i = 0; i < numeros.length; i++) {
                int contagem = 0;

                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[j] == numeros[i]) {
                        contagem++;
                }
            }
            if (contagem > maxContagem) {
                maxContagem = contagem;
                numeroMaisFrequente = numeros[i];
        
        } 
            
        }

    System.out.println("O número mais frequente é: "+ numeroMaisFrequente);
}

}

// help