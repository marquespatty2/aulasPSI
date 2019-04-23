package ficha3_herança_m11;

import java.util.Scanner;

/**
 *
 * @author al.patricianeves
 */

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    //construtor
    public Professor() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //metodo receberaum
    public void receberAum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Insira a quantia que quer ser aumentado");
        int receberaum=sc.nextInt();
        this.salario+=receberaum;
        System.out.println("Salario total:"+this.salario);
    } 
}