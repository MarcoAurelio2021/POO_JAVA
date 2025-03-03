package Secao14;

public class Cachorro extends Animal{
    // Ao usar a herança, força a classe usar as propriedade da classe PAi
    // Se a classe Pai tiver uma propriedade, a classe Filha também terá
   public Cachorro (String nome) {
    super(nome);
   }

   public void latir () {
    System.out.println("O cachorro " + nome + " está latindo");
   }
}