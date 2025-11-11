package stringarrays;

import java.util.Scanner;

public class Exercicio07_Arrays {

    public void exemplosManipulacaoArrays(){
      String[] nomes = new String[5];  
      Scanner input = new Scanner(System.in);  

      for (int i = 0; i < nomes.length; i++) {
        System.out.println("Digite o nome " + (i + 1) + ": ");
        nomes[i] = input.nextLine(); 
      }

      for (String nome : nomes) {
        System.out.println("Nome: " + nome);
      }

      input.close();

    }
    
}
