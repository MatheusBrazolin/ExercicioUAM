package exemplo2;
import java.util.Scanner;
public class Exemplo2 {   
    public static void main(String[] args) {
        ///EXERCICIO DE MEDIA DE NOTAS
    Scanner entrada = new Scanner (System.in);
    String nomes [][] = new String [3] [1];
    double notas [][] =new double [3][2];
    double media[] = new double [3];
    
    for (int linha = 0 ; linha <3; linha++){
        for (int coluna = 0; coluna <2; coluna ++){
            if (coluna == 0){
                System.out.println("Digite um nome:");
                nomes[linha] [coluna] = entrada.next();
                System.out.println("Digite a nota 1");
                notas[linha] [coluna] = entrada.nextDouble();
            } else {
                System.out.println("Digite a nota 2");
                notas[linha] [coluna] = entrada.nextDouble();
            }
        }
        media [linha] = notas [linha] [0] * 0.4 + notas[linha][1] * 0.6;
    }
    for (int i = 0; i <3; i ++) {   
    }
    for (int i = 0; i < 3; i ++){
        System.out.println("A medida do(a) aluno(a):" + nomes [i][0] + "e :" + media[i]);
    }
    entrada.close();
    }
    
}
