package ficha3_herança_m11;

/**
 *
 * @author al.patricianeves
 */
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    //construtor
    public Funcionario() {
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    //metodo mudarTrabalho
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
}