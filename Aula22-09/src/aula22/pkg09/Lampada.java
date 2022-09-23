
package aula22.pkg09;
class Lampada {
    String marca;
    String cor;
    int voltagem;
    boolean estado=false;
    
    public void acender(){
            estado=true;
                    System.out.println("Ligada!");

    }
    public void desligar(){
        if(estado == true){
        System.out.println("Desligada!");
    }else System.out.println("A lampada ja está apagada!");    
    }
        
    public String toString(){
        return "Marca: " + marca
                + "\nCor: " + cor
                + "\nVoltagem:" + voltagem;  
    }
}
