/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaherencia;

/**
 *
 * @author fam
 */
public class Tareaherencia {

    
    public static void main(String[] args) {
        
        Formas objformas = new Formas();
        Circulo objcirculo = new Circulo();
        Linea objlinea = new Linea();
        Triangulo objtriangulo = new Triangulo();
        Cuadrado objcuadrado = new Cuadrado();
                
        objformas.setdibujar("Formas");
        objformas.setcolor("Amarillos");
        
        System.out.println(objformas.getdibujar());
        System.out.println("Color: "+ objformas.getcolor());
        
        objcirculo.imprimir();
        System.out.println("Su radio es: " + objcirculo.getradio());
        
        objlinea.imprimir();
        
        objtriangulo.imprimir();
        System.out.println("El area es: " + objtriangulo.getangulo()+ "cm cuadrados");
        
        objcuadrado.imprimir();
        System.out.println("El area es: " + objcuadrado.getareacuadrado() + "cm cuadrados");
    
    }
    
}
