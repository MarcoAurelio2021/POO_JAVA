package Secao14;

public class Bateria extends instrumentoMusical {
    public Bateria (String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando bateria");
    }
}
