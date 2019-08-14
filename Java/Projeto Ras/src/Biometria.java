
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibyte
 */
public class Biometria {
 String Leitor;
 Boolean LerBio;
 int Digital;
 int C = 10;
 Scanner usu = new Scanner(System.in);
 void Ler(){
        System.out.println("Ler Biometria?");
        this.LerBio = true;
        System.out.println("Biometria Colhida Com Sucesso");
    }
 void NãoLer(){
        this.LerBio = false;
        System.out.println("Coleta de Biometria não realizada");
    }
 void Cadastrar(){
        if(this.LerBio == true){
            System.out.println("Cadrasdro Realizado Com Sucesso  !");
        }else{
            System.out.println("Cadastro não realizado ");
        }
 
}
 void Enviar(){
     if(this.LerBio == true){
      for(int i = 0; i<=100; i++){
          System.out.println("Enviando"+">> "+ i+"%");
        
      }
       System.out.print("Concluido Com Sucesso ");
 }else{
         System.out.println("Envio não realizado ");
     }
 }
 
 void Tancar(){
     if(this.LerBio==true){
         System.out.println("Trancado");
     }else{
         System.out.println("Destrancado");
     }
 }
 
}
