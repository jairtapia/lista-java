/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int id;
    private String nombre;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setNombre(String name){
        this.nombre = name;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public Nodo Actualizar(){
        return this;
    }
    
}
