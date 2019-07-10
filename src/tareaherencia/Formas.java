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
public class Formas {
    private String Color;
    private String Dibujar;
    double Radio,Angulo, Areacuadrado;
            
    public Formas(){
    }
    public void setcolor(String color){
        this.Color = color;
    }
    public String getcolor(){
        return this.Color;
    }
    public void setdibujar(String dibujar){
        this.Dibujar = dibujar; 
    }
    public String getdibujar(){
        return this.Dibujar;
    }
    
    public void setradio(double c){
        Radio = c;
        
    }
    public double getradio(){
        double r, pi=3.141592 ;
        r = Radio/(2*pi);
        return r;
    }
    
    public void setangulo(double b, double h){
        Angulo = b*h/2; 
    }
    public double getangulo(){
        return Angulo;
    }
    
    public void setareacuadrado(double l){
        Areacuadrado = l*l; 
    }
    public double getareacuadrado(){
        return Areacuadrado;
    }
    
    public void imprimir(){
        System.out.println(Dibujar);
    }
}
