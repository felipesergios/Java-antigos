/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author ibyte
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Caneta C1 = new Caneta();
      C1.Ponta = 0.5f;
      C1.Cor = "AZUL";
      C1.Tampar();
      C1.status();
      C1.Rabiscar();
    }
    
}
