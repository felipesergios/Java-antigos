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
public class RegistroInicial {
 private String nome;
private String Idioma;
private String Sexo ;
private String Sistema ;
private Boolean Ativo = false;
private String executar ;
private String Comando ;
Scanner usu = new Scanner(System.in);
//metodos Públic
public void apresentar(){
    System.out.println("-----------------------------------------------");
    System.out.println(   " Olá Seja Bem Vindo A Sua IA Pessoal "  );
    System.out.println("Meu Nome é "+this.getNome()+"  Estou Aqui Para Te Ajudar");
    System.out.println("--------------------------------------------------");
}
public void status(){
    System.out.println("__________________________________________");
    System.out.println(this.nome+"    NOME DE REGISTRO");
    System.out.println(this.Idioma+"  IDIOMA");
    System.out.println(this.Sexo+"    SEXO");
     System.out.println("__________________________________________");
      
}   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }


public void Sistema(){
    if(this.Ativo==true){
    System.out.println(this.Sistema+"Version");
     if(this.Ativo == true){
      for(int i = 0; i<=100; i++){
          System.out.print("Inicializando."+">> "+ i+"%");
          System.out.println("");
          if(i==100){
              System.out.println("Sistema Inicializado");}
      }
         System.out.println("vamos nos conhecer ? "
                 + "Me Fala Seu Nome ? ");
    
      
}  
}



}

    public String getSistema() {
        return Sistema;
    }

    public void setSistema(String Sistema) {
        this.Sistema = Sistema;
    }

    public Boolean getAtivo() {
        return Ativo;
    }

    public void setAtivo(Boolean Ativo) {
        this.Ativo = Ativo;
    }
    public void executar(){
        
          System.out.println("-Ava");
           System.out.print("Executar :");
           Comando=usu.nextLine();
           
           if(Comando.equals("")){
               System.out.println("-Ava");
           System.out.print("Executar :");
           Comando=usu.nextLine();
           
           }
        
           
           
           if(Comando.equals("contador")){
            System.out.println("Numero Inicial e Final: ");
        for(int i = usu.nextInt(); i<=usu.nextInt(); i++){
          System.out.print("|Contagem|"+"| "+ i+"|");}
             System.out.println("________CONTADOR-SERGIO-TEC-VERSION______________");
             Comando="";
        }
         
         
         if(Comando.equals("fatoreal")){
             System.out.println("Digite o Numero que Deseja Obter O Fatoreal");
    int N = usu.nextInt();
    int f = 1;
    int c = N;
    while(c>=1){
        f*=c;
        c--;
    }
             System.out.println("fatoreal é  : "+f);
             System.out.println("______________FATREAL-SERGIO-TEC-VERSIONBETA4____________________________________");
         Comando="";
         }
         
         
         
       
           
           if(Comando.contentEquals("nao")){
           System.out.println("Deseja Desligar Sistema ?");
           Comando=usu.nextLine();
       if(Comando.contentEquals("Sim")){
           System.out.println("Desligando Sistema");
           for(int i = 90; i<=100; i++){
          System.out.print("Desligando."+">> "+ i+"%");
               System.out.println("Desligado");
       }
           
           

}
}
    }
}

