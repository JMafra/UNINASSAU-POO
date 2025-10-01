package classesobjetos;

public class Exercicio06_ContaBancaria {

    private String numero;
    private double saldo;

    public void setSaldo(double s){
       this.saldo = s;
    }

    public double getSaldo(){
      return this.saldo;
    }

    public void setNumero(String n){
       this.numero = n;
    }

   public String getNumero(){
      return this.numero;
   }

   public  void creditar(double valor){
       saldo = saldo + valor;
    }

   public void debitar(double valor){
       saldo = saldo - valor;
    }

}
