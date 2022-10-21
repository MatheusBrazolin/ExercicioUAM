
package aula13.pkg10;

public abstract class FiguraGeometrica {
    //atributos
    private String nome;
    
    //metodos acessores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    //construtor
    public FiguraGeometrica(String nome){
        this.nome = nome;
    }
    
    //comportamento
    public abstract double calcularArea();
}