package sintaxebasica;

import java.util.Scanner;

public class Exercicio04 {
    
    /*
     * Uso do comando de repetiçao while
     */
    public void lerVariosNomes(){
        Scanner input = new Scanner(System.in);
        String nome = null;

        System.out.println("Digite um nome (fim - parar):");
        nome = input.next();

       while (!nome.equalsIgnoreCase("fim")) {
         System.out.println("Digite um nome (fim - parar):");
          nome = input.next();
        }

        System.out.println("saiu do laço");

        input.close();

    }
    
}
