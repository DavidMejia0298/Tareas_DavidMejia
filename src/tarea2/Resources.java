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
public class Resources {
    public Resources() {
    }
    //metodo 1
    public void mensaje(){
        System.out.println("Estoy aprendiendo, pero seré el mejor programador");
    }
    //metodo 2
    public void notas(int nota){
        if(nota>=70&&nota<=100){
            System.out.println("Aprobado");
        }
        else{ if(nota<70&&nota>=0){
               System.out.println("Reprobado");
              }
        }
    }
    //metodo 3
    public void divisiones( int num1, int num2){
        if(num2!=0){
            int division;
            division = num1/num2;
            System.out.println("La division es: " +division);
        }
        else{if(num2==0){
            System.out.println("No hay Solucion");
             }
        }       
    }
    //metodo 4
    public void lista(int maximo){
        for(int i=1;i <= maximo; i=i+1){
            System.out.println(i);
        }
    }
               
}
