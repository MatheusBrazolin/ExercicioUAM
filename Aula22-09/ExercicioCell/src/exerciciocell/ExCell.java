package exerciciocell;
import java.util.Scanner;
public class ExCell {
    Scanner entrada=new Scanner(System.in);

    ///Atributos
    String marca;
    String modelo;
    double tamanhoTela;
    boolean estado=false;
    
    ///Comportamentos
    public void botao(){
        if(estado == false){
            System.out.println("Ligando...");
            estado=true;
        

   }else{
        System.out.println("Deseja desligar? S ou N"); 
        char opcao = entrada.next().charAt(0);
            if(opcao == 'S'){
            System.out.println("Desigando...");
            estado=false;
        } 
      }
      entrada.close();
    }
    public String toString(){
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\ntamanhoTela:" + tamanhoTela; 
    }
}    
