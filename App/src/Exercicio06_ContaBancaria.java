public class Exercicio06_ContaBancaria {

    String numero;
    double saldo;

    void creditar(double valor){
       saldo = saldo + valor;
    }

    void debitar(double valor){
       saldo = saldo - valor;
    }

}
