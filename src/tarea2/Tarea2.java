/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea2;

/**
 *
 * @author fam
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resources objresources = new Resources();
        
        objresources.mensaje(); //llamando metodo 1
        System.out.println("...");
        objresources.notas(69); //llamando metodo 2
        System.out.println("...");
        objresources.divisiones(8, 2); //llamando metodo 3 e ingresando valores.
        System.out.println("...");
        objresources.lista(13);  //llamando metodo 4 e ingresando el valor.
    }
    
}
