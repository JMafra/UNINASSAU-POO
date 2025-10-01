import classesobjetos.*;

public class Main {

    /* Para executar os exercícios criados é necessário:
     *  1. Criar um objeto da classe a ser executada 
     *  2. Chamar o método que deseja rodar utilizando o 
     *  objeto criado (passo 1).  
     */
     public static void main(String[] args) throws Exception {

       Exercicio06_ContaBancaria conta = new Exercicio06_ContaBancaria();
       conta.setNumero("2222-2");
       conta.setSaldo(1000);

       conta.creditar(500);
       System.out.println("Saldo" + conta.getSaldo());

       conta.debitar(100);
       System.out.println("Saldo" + conta.getSaldo());

      /*  Exercicio05_Cachorro cachorro1 = new Exercicio05_Cachorro();
       Exercicio05_Cachorro cachorro2 = new Exercicio05_Cachorro();
       cachorro1.latir();
       cachorro1.nome = "Bob";
       cachorro2.nome = "Skype";
       System.out.println(cachorro1.nome);
        System.out.println(cachorro2.nome);*/

      /* Exercicio01 exercicio01 = new Exercicio01();
       exercicio01.imprimirHelloWorld(); */
      
      /*   Exercicio02 exercicio02 = new Exercicio02();
        exercicio02.calcularMediaAluno(); */
        
      /* Exercicio03 ex = new Exercicio03();
       ex.converterMesExtenso();   

       Exercicio04 exercicio04 = new Exercicio04();
       exercicio04.lerVariosNomes();*/

     }
    
}
