package stringarrays;

public class Exercicio06_Strings {

   public void exemplosManipulacaoStrings(){
     String nome = "Juliana";
     String sobrenome = "Mafra";     

      nome = nome.trim();

      nome = nome.toUpperCase();     

      int tamanho = nome.length();
      System.out.println(tamanho);

      if (nome.equals(sobrenome)){
        System.out.println("Iguais");
      }else{
        System.out.println("Diferentes");
      }
      System.out.println("Nome Completo:" + nome + " " +  sobrenome); 
    }
    
}
