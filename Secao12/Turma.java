package Secao12;

import java.util.Arrays;

public class Turma {
    private String[] alunos;

   // Contrutor
   // Recomenda-se trabalhar com cópia de arrays ao invés de expo-lo diretamente;
   public Turma(String[] alunos) {
    this.alunos = Arrays.copyOf(alunos, alunos.length);
   }

   public String [] getAlunos () {
    return Arrays.copyOf(this.alunos, this.alunos.length);
   }

   public String [] setTurma (String [] alunos) {
    if (alunos.length > 0) {
         this.alunos = Arrays.copyOf(alunos, alunos.length);
    } else {
        System.out.println("Valor inválido");
    }
    return this.alunos;
    
   }
}
