package ficha3_herança_m11;

/**
 *
 * @author al.patricianeves
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    //construtor
    public Aluno() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
 
    //metodo cancelarMatr
    public void cancelarMatr(){
        System.out.println("Matrícula Cancelada");
    }
}