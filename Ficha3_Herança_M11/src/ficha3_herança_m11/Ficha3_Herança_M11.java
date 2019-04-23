package ficha3_herança_m11;

import java.util.Scanner;

/**
 *
 * @author al.patricianeves
 */
public class Ficha3_Herança_M11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //criamos um objeto
        Pessoa pess=new Pessoa();
        pess.fazeraAniv();
        //criamos um objeto
        Aluno alun=new Aluno();
        alun.cancelarMatr();
        //criamos um objeto
        Funcionario func=new Funcionario();
        func.mudarTrabalho();
        //criamos um objeto
        Professor prof=new Professor();
        prof.receberAum();
        
        pess.setNome("Patrícia");
        alun.setNome("Diogo");
        prof.setNome("Ana Esteves");
        func.setNome("Paula");
        pess.setSexo("Feminino");
        alun.fazeraAniv();
        System.out.println(pess.toString());
        alun.setCurso("Informática");
        prof.setSalario(700);
        
        //pess.receberAum(552.36);
                
        //da erro porque não podemos chamar um método que não existe na classe.

    }   
}
