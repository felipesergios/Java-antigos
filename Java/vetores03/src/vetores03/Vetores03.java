/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores03;

import java.util.Arrays;

/**
 *
 * @author ibyte
 */
public class Vetores03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int vetor[]= {3,7,6,1,9,4,2};
     for(int v:vetor){
         System.out.print( "   " +v);
     }
        System.out.println("");
        int p = Arrays.binarySearch( vetor , 1);
        System.out.println("o Valor foi Encontrado Na posição : "+p);
     
    }
    
    
}
