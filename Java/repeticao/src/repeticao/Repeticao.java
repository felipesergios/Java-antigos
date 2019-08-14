/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import java.util.Scanner;

/**
 *
 * @author ibyte
 */
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
    int Primo = leitor.nextInt();
    int DIV = 0;
  for (int A = 1; A<=1000; A++){
      if(Primo % A == 0){
          DIV++;
      }
  }
      if(DIV == 2){
          System.out.println("PRIMO");
      }else{
          System.out.println("Não é");
      }
    }
}
