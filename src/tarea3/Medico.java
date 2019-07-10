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
public class Medico {
    public Medico(){
    }
    String _Aspirante;
    String _Añosestudio;
    String _Practica;
    
    public void setaspirante(String psAspirante){
        _Aspirante = psAspirante;
    }
    public String getaspirante(){
        return _Aspirante;
    }
    public void setañosestudio(String psAñosestudio){
        _Añosestudio = psAñosestudio;
    }
    public String getañosestudio(){
        return _Añosestudio;
    }
    public void setpractica(String psPractica){
        _Practica = psPractica;
    }
    public String getpractica(){
        return _Practica;
    }
}
