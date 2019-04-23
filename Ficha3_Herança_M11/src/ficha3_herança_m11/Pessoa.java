package ficha3_herança_m11;

/**
 *
 * @author al.patricianeves
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //construtor
    public Pessoa() {
        idade=33;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //metodo fazerAbniv
    public void fazeraAniv(){
        this.idade++;
        System.out.println("Idade:"+this.idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}