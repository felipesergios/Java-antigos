/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author ibyte
 */
public class MATRIZ {
private static int[][] Matriz;
public static void inicializarMatriz() {
    int TAMANHO=10;
    int VAZIO=1;
		int i, j; 
for (i = 0; i < TAMANHO; i++) { 
Matriz[i][0] = i; 
Matriz[i][Matriz.length - 1] = i; 
Matriz[0][i] = i; 
Matriz[Matriz.length - 1][i] = i; 
		} 
for (i = 1; i < Matriz.length - 1; i++) { 
for (j = 1; j < Matriz.length - 1; j++) { 
	Matriz[i][j] = VAZIO; 
			} 
		} 
	}
public static void imprimir() { 
    for (int[] Matriz1 : Matriz) {
        for (int j = 0; j < Matriz.length; j++) {
            System.out.print(Matriz1[j]);
        }
        System.out.println();
    } 
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Matriz = new int[3][3]; 
		inicializarMatriz(); 
		imprimir(); 
    }
    
}
