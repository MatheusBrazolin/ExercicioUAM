package exercicio.pkg2;
public class ExRobo {
    ///Atributo
    private char direcao;
    
    ///metodo acessor
    public void setDirecao(char direcao){
        this.direcao=direcao;
    }
    public void testar(){
        switch(this.direcao){
            case 'N': System.out.print("direção norte..."); break;
            case 'S': System.out.print("direção sul..."); break;
            case 'L': System.out.print("direção leste..."); break;
            case 'O': System.out.print("direção oeste..."); break;
            default:
                {System.out.println("Direção invalida!");
                    System.out.println("Direção norte...");    
            }
        }
    }
}
