
package exercicio29.pkg09;
public class ContaBancaria {
    ///ATRIBUTOS
    private String nome;
    private double saldo;
    private int numero;
    
    ///METODOS ACESSORES 
    public void setNumero (int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setNome (String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    ///COMPORTAMENTO
    public void depositar(double valor){
        this.saldo+=valor*1.1;
    }
    public void sacar(double valor){
        if(this.saldo >= valor){
            System.out.println("Saldo");
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
