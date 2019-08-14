/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimentos;

import java.util.Scanner;

/**
 *
 * @author ibyte
 */
public class Procedimentos {
  static  int  soma (int a , int b){
        int s = a + b;
        return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int escolha =0;
        System.out.println("Inicio de Programa !!");
        int nume_pri=0;
        int nume_sec=0;
        System.out.println("Primero Numero para soma:");
        nume_pri=Leitor.nextInt();
        System.out.println("Segundo Numero para soma:");
        nume_sec=Leitor.nextInt();
        
        
        int A =soma(nume_pri , nume_sec);
        System.out.println(A);
        System.out.println("Deseja Iniciar Contador? :");
        escolha=Leitor.nextInt();
        if(escolha==1){
            int inicio =0;
            int fim = 0;
            System.out.println("INICIO:");
            inicio=Leitor.nextInt();
            System.out.println("FIM:");
            fim=Leitor.nextInt();
        System.out.println(operacoes.contador (inicio ,fim ));
        }else{
            System.out.println("Fim do programa");
        }
        
        
        
   
    }
    
}
