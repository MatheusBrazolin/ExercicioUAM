
package aula23.pkg09;
import java.util.Random;
import java.util.Scanner;
public class Aula2309 {

    public static void main(String[] args) {
    Random random = new Random();
    Scanner entrada = new Scanner(System.in);
    
    double valorCarteira;
        System.out.println("digite o valor que quer depositar ");
        valorCarteira = entrada.nextDouble();
        
    double saldo;
        
    for(int i = 1;; i++){
        
    int dado1 = random.nextInt(7);
    int dado2 = random.nextInt(7);
    int soma=0;
    
    soma = dado1 + dado2;
    
        
        System.out.println(" Dado 2: " + dado2);
        System.out.println(" A soma dos seus dados são: " + (dado1 + dado2));
        
        
        
        if (soma == 7 || soma == 2){
            System.out.println(" Dado 1: " +dado1);
            System.out.println(" Dado 1: " +dado2);
            System.out.println(" Parabens, você ganhou!!!!");
            saldo =  valorCarteira * 2;
            System.out.println("Saldo atual:" + saldo);
        } if (soma == 10){
            System.out.println(" Dado 1: " +dado1);
            System.out.println(" Dado 1: " +dado2);
            System.out.println(" Você perdeu!");
            saldo =  valorCarteira * 0;
            System.out.println("Saldo atual:" + saldo);
            System.out.println("Aposte novamente:");

        }if (soma == 6){
            System.out.println(" Dado 1: " +dado1);
            System.out.println(" Dado 1: " +dado2);
            System.out.println(" Empate! ");
            saldo =  valorCarteira;
            System.out.println("Saldo atual:" + saldo);
         break;
            } else
            System.out.println(" Dado 1: " +dado1);
            System.out.println(" Dado 1: " +dado2);
        }
    }
}