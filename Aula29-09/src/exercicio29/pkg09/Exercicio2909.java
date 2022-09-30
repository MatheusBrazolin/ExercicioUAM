
package exercicio29.pkg09;
import java.util.Scanner;
public class Exercicio2909 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria cc = new ContaBancaria();
    
        cc.setNome("Matheus Brazolin");
        cc.depositar(1000);
        cc.sacar(10);
        
        System.out.println(cc.getSaldo());
        
        entrada.close();
    }
    
}
