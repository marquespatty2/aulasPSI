package exemplo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author al.patricianeves
 */
public class Caderno {
    ArrayList <Double> notas=new ArrayList();
    
    public void adicionarNota(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Quantas notas quer inserir?");
        int num=sc.nextInt();
        for (int i=0; i<num; i++){
            System.out.println("Insira a nota");
            double nota1=sc.nextDouble();
            notas.add(nota1);
        }
    }
    public int quantNotas(){
        return notas.size();
    }
    
    //Mostra se um dado número existe ou não na lista
    public void mostraNotas(int numero){
        if(numero<0)
            System.out.println("Número inválido!!");
            else if (numero< quantNotas()){
                    System.out.println("O valor que está no índice que pretende é o: "+notas.get(numero));
                    }
            else
                System.out.println("Nota inexistente");
        }
    }