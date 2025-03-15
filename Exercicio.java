import java.util.Arrays;

public class Exercicio {
   /*  public static void main(String[] args) {
        int [] vetorOriginal = {1,2,3,4,5};
        int [] vetorCopia = new int[vetorOriginal.length];
        vetorCopia = inverterOrdemVetor(vetorOriginal);
        System.out.println(Arrays.toString(vetorCopia));

    }
 public static int [] inverterOrdemVetor (int [] vetorOriginal) {
    int [] vetorCopia = new int[vetorOriginal.length];
    for (int i = 0; i < vetorOriginal.length; i++) {
        vetorCopia[i] = vetorOriginal[vetorOriginal.length -i -1];
    }
    return vetorCopia;
 } 
    */

    public static void main(String[] args) {
        int [] vetorOriginal = {1,2,3,4,5};
        int [] vetorCopia = new int[vetorOriginal.length];
        vetorCopia = inverterArray(vetorOriginal);
    }
    public static int[] inverterArray(int[] numeros) {
        int[] invertido = new int[numeros.length];
        
        // Percorre o array de trás para frente e preenche o novo array
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        
        return invertido;
    }
}


