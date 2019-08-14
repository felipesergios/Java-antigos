/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avai;

import java.util.Scanner;

/**
 *
 * @author ibyte
 */
public class AvaI {


    public static void main(String[] args) {
    RegistroInicial IA = new RegistroInicial(); 
   Scanner usu = new Scanner(System.in);
   boolean U=false;
   String Comando="";
   IA.setNome("AVA");
   IA.setIdioma("Portugues");
   IA.setSexo("Feminino");
   IA.apresentar();
   if(IA.equals(IA)){
       System.out.println("-Ava");
       System.out.println("Deseja Inicializar Sistema ? ");
       U=true;
       Comando=usu.nextLine();
       
       if(Comando.contentEquals("sim")){
       System.out.println("Okay");
           System.out.print("Executando....");
       IA.setSistema("IA01");
       IA.setAtivo(true);
       IA.Sistema();
        System.out.println(" Exibir Status Inicial ?");
        Comando=usu.nextLine();
        if(Comando.contentEquals("sim")){
        IA.status();
        }
        
        
        
        
           //System.out.println("-Ava");
           //System.out.print("Executar :");
           //Comando=usu.nextLine();
        
          IA.executar();
           
           
           
           if(Comando.equals("calc")){   
           
                   int N1;
        int N2;
        int N3;
        int M;
        String operacao = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("---Digite 1 para soma ou 2 Para Multiplicaçã---o");
        System.out.println("--Digite 3 Para Soma De 3 Numeros ou 4 Para Multiplicar 3 Numeros--");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        operacao = entrada.nextLine();

        System.out.println(">>>>>>Digite o Primeiro Numero<<<<");
        N1 = Integer.parseInt(entrada.nextLine());

        System.out.println(">>>>Digite o Segundo Numero<<<<");
        N2 = Integer.parseInt(entrada.nextLine());
        if(operacao.equals("3")){
            System.out.println(">>>Digite o Terceiro Numero<<<");
            N3 = Integer.parseInt(entrada.nextLine());
            System.out.println("O Resultado é "+(N1+N2+N3));
            System.out.println("MEDIA IGUAL : "+(N1+N2+N3)/3);
        }
        if(operacao.equals("4")){
            System.out.println(">>>Digite o Quarto Numero<<<");
            N3 = Integer.parseInt(entrada.nextLine());
            System.out.println("O Resultado é "+(N1*N2*N3));
              System.out.println("MEDIA IGUAL : "+(N1+N2+N3)/3);
        }
        
        

        if(operacao.equals("1")){
            
            System.out.println("O Resultado da Soma é:" + (N1 + N2));
              System.out.println("MEDIA IGUAL : "+(N1+N2)/2);
        
        }
        if(operacao.equals("2")){
            System.out.println("O Resultado da Multiplicação é:" + (N1 * N2));
              System.out.println("MEDIA IGUAL : "+(N1+N2)/2);
        }
            System.out.println("_||||||_________CALC-SERGIO-TEC-VERSION-BETA01______________||||_");
            Comando="";
            IA.executar();
        }
           
        if(Comando.equals("")){   
        IA.executar();
         
       
       }else{System.out.println("ERRO DE SITEMA CODE 404");}
       
       
       
   }
   
       
   
   }
   
    }
}
