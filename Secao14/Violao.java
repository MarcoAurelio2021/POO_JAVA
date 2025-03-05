package Secao14;

public class Violao extends instrumentoMusical {
    public Violao (String nome) {
        super(nome);
    }
    // Implementando 
    @Override
    public void tocar() {
        System.out.println("Tocando violão"); 
    }
}
