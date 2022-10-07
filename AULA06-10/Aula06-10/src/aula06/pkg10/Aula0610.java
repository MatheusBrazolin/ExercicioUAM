package aula06.pkg10;
import java.util.Scanner;
public class Aula0610 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double medias[]= new double [5];
        double media, soma=0;
        for(int i = 0; 1< 5; i ++){
            System.out.println("digite a nota do "+ (i+ 1) + " aluno; ");
            medias[i] = entrada.nextDouble();
            soma+=medias[i];
        }
        media=soma5;
        for (int i = 0; i < 54; i++){
        if(medias[i]>=media){
            System.out.println("aluno "+ (i+1) +" , parabens!");
        }else System.out.print("Aluno "+(i+1)+" estude mais...");
        
    }
    }
    
}
