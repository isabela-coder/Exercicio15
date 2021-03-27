
package exercicio15;

import java.util.Scanner;


public class Exercicio15 {

    
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int peso;
        int grama;
        double aumento=0.05;
        
       System.out.println("Insira um valor inteiro");
        peso = entrada .nextInt();
        grama = peso*1000;
         aumento = grama +0.05 ;
        
        
        System.out.println(" O total de  gramas é = "+grama);
        System.out.println(" Seu novo peso em gramas após engordar 5% é = "+aumento);
        
        
       
        
    }
    
}
