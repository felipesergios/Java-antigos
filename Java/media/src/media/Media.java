/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.util.Scanner;

/**
 *
 * @author ibyte
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
System.out.println("Digite o primeiro nome : ");
String nome1 = leitor.next();
System.out.println("Digite o segundo nome : ");
String nome2 = leitor.next();
if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");}
if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println(" Os nomes são iguais independente de letras maisculas e minusculas!");
        } else {
            System.out.println("São diferentes");
        }
 if (nome1.lenght()<= nome2.lenght() && nome1.substring(3).equalsIgnoreCase(nome2)){
     System.out.println(nome1 + "Está contido no " + nome2);
 } else {
     System.out.println(nome1 + "não está contido no " + nome2);
 }
        
            
    }
    
}
