
package exmatriz.pkg15.pkg09;
import  java.util. Scanner ;
public class ExMatriz1509 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);

    ///
    
    int matriz[][] = new int [2][2];
        for( int y=0; y<2; y++){
            for( int x=0; x<2; x++){
                System.out.println("Digite o primeiro número:  ");
                matriz[y][x] = entrada.nextInt();
        }}
        for( int y=0; y<2; y++){
            for( int x=0; x<2; x++){
//               System.out.println("Y:" + (y+1) + "X" + (x+1) ":" matrix[y][x]); 
            System.out.println("  " + matriz[y][x]+ "  ");
            }
            System.out.println("");
        } 
    }
}
