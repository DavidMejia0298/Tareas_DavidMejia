/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea1;

/**
 *
 * @author fam
 */
public class Tarea1 {
    
    public static void main(String args[]) {
        // Ejercicio 1  
        //Crear el código que imprima la siguiente salida: "Hola, soy Arnol Gutiérrez" (Usar su nombre)
        System.out.println("Solucion 1");
        System.out.println("Hola,soy David Mejia");
        System.out.println("...");
        
        //Ejercicio2
        //Crear un programa que imprima en consola todas las operaciones aritméticas de dos números enteros (suma, resta, multiplicación, divición, mod)
        double num1 = 9;
        double num2 = 3;
        double sum, rest, multi, division=0, mod;
        sum=num1+num2;
        rest=num1-num2;
        multi=num1*num2;
        mod=num1%num2;
        if(num2 !=0){
          division=num1/num2;
        } 
        System.out.println("Solucion 2");
        System.out.println("los numeros enteros son 9 y 3 y sus operaciones son:");
        System.out.println("9+3= " +sum);
        System.out.println("9-3= " +rest);
        System.out.println("9x3= " +multi);
        System.out.println("9/3= " +division);
        System.out.println("9%3= " +mod);
        System.out.println("...");
        
        //Ejercicio 3
        //Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas expresiones daría como resultado verdadero o falso:
        //M>T
        //T/K == -5
        //(M+T == 7)||(M-T == 5)
        System.out.println("Solucion 3");
        int M=6, T=1, K=-10;
        //Uso if para definir la condicion del verdadero y falso.
        if(M>T){
            System.out.println("M>T es verdadero");
        }
        else{ if(M<T){
            System.out.println("M>T es falso");}    
        }
        if(T/K==-5){
            System.out.println("T/K == -5 es verdadero");
        }
        else{ if(T/K!=-5){
            System.out.println("T/K == -5 es falso");}
        }
        if(M+T==7||M-T==5){
            System.out.println("(M+T==7)||(M-T==5) es verdadero");
        }
        else{ if(M+T!=7||M-T!=5){
            System.out.println("(M+T==7)||(M-T==5) es falso");}
        }
        System.out.println("...");
        
        //Ejercicio 4
        //Crear un arreglo que guarde e imprima 10 nombres de tus compañeros de la clase.
        System.out.println("Solucion 4");
        String[] nombre = new String[10];
        nombre[0] = "Ruth Juarez";
        nombre[1] = "Mario Rivera";
        nombre[2] = "Juan Rodriguez";
        nombre[3] = "Ana Chavez";
        nombre[4] = "Juan Argueta";
        nombre[5] = "Dany Cruz";
        nombre[6] = "Christian Hernandez";
        nombre[7] = "Andrea Bonilla";
        nombre[8] = "Jorge Tinoco";
        nombre[9] = "Francis Argueta"; 
        System.out.println(nombre[0]);
        System.out.println(nombre[1]);
        System.out.println(nombre[2]);
        System.out.println(nombre[3]);
        System.out.println(nombre[4]);
        System.out.println(nombre[5]);
        System.out.println(nombre[6]);
        System.out.println(nombre[7]);
        System.out.println(nombre[8]);
        System.out.println(nombre[9]);
        System.out.println("...");
        
        //Ejercicio 5
        //Crear un arreglo multidimensional que guarde más datos personales tus compañeros de clase (nombre, apellido, carrera, lugarTrabajo), tomando como referencia de la información colocada en el foro Conociendonos. Llenar 5 registros
        System.out.println("Solucion 5");
        String[][] datos = new String[6][4];
        datos[0][0] = "Nombre";
        datos[0][1] = "Apellido";
        datos[0][2] = "Carrera";
        datos[0][3] = "Lugar/Trabajo";
        datos[1][0] = "Onix";
        datos[1][1] = "Sanchez";
        datos[1][2] = "Ing. Industrial";
        //desc. es desconocido
        datos[1][3] = "desc.";
        datos[2][0] = "Dany";
        datos[2][1] = "Cruz";
        datos[2][2] = "Ing. Computacion";
        datos[2][3] = "desc.";
        datos[3][0] = "Ana";
        datos[3][1] = "Chavez";
        datos[3][2] = "Ing.Industrial";
        datos[3][3] = "desc.";
        datos[4][0] = "Ruth";
        datos[4][1] = "Juarez";
        datos[4][2] = "Ing. Electronica";
        datos[4][3] = "desc.";
        datos[5][0] = "Francis";
        datos[5][1] = "Argueta";
        datos[5][2] = "Ing. Computacion";
        datos[5][3] = "desc.";
        System.out.println(datos[0][0]+"   "+datos[0][1]+"   "+datos[0][2]+"   "+datos[0][3]);
        System.out.println(datos[1][0]+"    "+datos[1][1]+"  "+datos[1][2]+"    "+datos[1][3]);
        System.out.println(datos[2][0]+"    "+datos[2][1]+"     "+datos[2][2]+"   "+datos[2][3]);
        System.out.println(datos[3][0]+"     "+datos[3][1]+"   "+datos[3][2]+"     "+datos[3][3]);
        System.out.println(datos[4][0]+"    "+datos[4][1]+"   "+datos[4][2]+"   "+datos[4][3]);
        System.out.println(datos[5][0]+" "+datos[5][1]+"  "+datos[5][2]+"   "+datos[5][3]);
        System.out.println("...");
        
        //Ejercicio 6
        //Crear un programa que imprima en consola un nombre de estudiante, una nota y una etiqueta que diga Aprobado o Reprobado, dependiendo del valor de la nota que tenga.
        System.out.println("Solucion 6");
        String[][] notas = new String[2][3];
        double x, y;
        x = 80;
        y = 62;
        notas[0][0] = "Jose";
        //no le doy valor a las notas ya que estas son X y Y.
        notas[0][1] = "";
        notas[1][0] = "Andrea";
        notas[1][1] = "";
        
        if(x>=70){
            notas[0][2] = "Aprobado";
        }
        else{ if(x<70){
              notas[0][2] = "Reprobado";}
        }
        if(y>=70){
            notas[1][2] = "Aprobado";
        }
        else{ if(y<70){
              notas[1][2] = "Reprobado";}
        }
        System.out.println(notas[0][0]+"   "+x+notas[0][1]+"  "+notas[0][2]);
        System.out.println(notas[1][0]+" "+y+notas[1][1]+"  "+notas[1][2]);
        System.out.println("...");
        
        //Ejercicio 7
        //Escribe un programa que imprima mediante un ciclo los números pares del 2 al 100.
        System.out.println("Solucion 7");
        
        for(int i=2; i<=100; i=i+2){
            System.out.println(i);
        }
        
    }
}