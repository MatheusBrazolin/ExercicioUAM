
package aula13.pkg10;
public class estagiario extends Estudante {

    //atributo
    private int horasTrabalhoSemana;

    //metodos acessores
    public int getHorasTrabalhoSemana() {
        return horasTrabalhoSemana;
    }

    public void setHorasTrabalhoSemana(int horasTrabalhoSemana) {
        this.horasTrabalhoSemana = horasTrabalhoSemana;
    }

    //construtor
    public estagiario(String nome, String curso, int horasTrabalhoSemana, int horasEstudoSemana) {
        super(nome, curso, horasEstudoSemana);
        this.horasTrabalhoSemana = horasTrabalhoSemana;
    }

    //comportamento
    @Override
    public int horasDedicacao() {
        return this.horasTrabalhoSemana / super.getHorasEstudoSemana();
    }

    @Override
    public double salarioBase() {
        System.out.print("Nome: " + super.getNome() + ", salario = ");
        return this.horasTrabalhoSemana * 10;
    }

}