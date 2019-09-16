/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fat;

import java.util.Scanner;

/**
 *
 * @author ulab27ep
 * 
 */
public class Fat {
     static  int  Fatoreal (int y){
        int r = 1;
        for(int i=1;i<=y;i++){
        r=i*r;
        }
        return r;
    }
    static int SomaFatoral(int a , int b){
        int Resultado = Fatoreal(a)+Fatoreal(b);
        return Resultado;
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        System.out.print("Digite Operador 1:");
        int Op1 = Leitura.nextInt();
        int M = Fatoreal(Op1);
        System.out.println("O Fatoreal de "+Op1+" Vale :"+M);
        System.out.print("Digite operador 2:");
        int Op2 = Leitura.nextInt();
        M = Fatoreal(Op2);
        System.out.println("O Fatoreal de "+Op2+" Vale :"+M);
        int R = SomaFatoral(Op1,Op2);
        System.out.println(" A Soma Fatoreal dos Numeros :"+Op1+" e "+Op2+"  Vale :"+R);
        
    }
    
}
