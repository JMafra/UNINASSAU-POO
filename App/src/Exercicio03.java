import java.util.Scanner;

public class Exercicio03 {

    /* 
     * Uso do comando de repetição swith.
     * Método para ler um mês como um número inteiro
     * e imprimir no terminal o nome do mês por extenso     * 
     */

    public void converterMesExtenso(){
        Scanner input = new Scanner(System.in);

        int mesInteiro;
        String mesExtenso;

        System.out.println("Digite o mes (inteiro):");
        mesInteiro = input.nextInt();

       
        switch (mesInteiro) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Marco";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
        
            default:
                mesExtenso = "Mes invalido!";
                break;
        }
      System.out.println(mesExtenso);

      input.close();
        
    }
}
