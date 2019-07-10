/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea3;

/**
 *
 * @author fam
 */
public class Tarea3 {

    
    public static void main(String[] args) {
        
        Medico objmedico = new Medico();
        
        System.out.println("Trabajo de Medico");
        objmedico.setaspirante("Gabriela Zelaya");
        objmedico.setañosestudio("7 años mas 3 de especializacion.");
        objmedico.setpractica("si");
        
        System.out.println("El nombre del aspirante es: " + objmedico.getaspirante());
        System.out.println("Los años de estudio son: " + objmedico.getañosestudio());
        System.out.println("¿Requiere practica?: " + objmedico.getpractica());
    }
    
}
