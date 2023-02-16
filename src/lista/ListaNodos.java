/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class ListaNodos {
    ArrayList<Nodo> lista;
    
    public ListaNodos(ArrayList<Nodo>lista){
        this.lista = lista;
    }
    public void AddNodo(Nodo nodo){
        this.lista.add(nodo);
    }
    public ArrayList<Nodo> Actualizar(){
        return this.lista;
    }
    public Nodo Buscar(Nodo nodo){
        Nodo aux = null;
        for(Nodo n:this.lista){
            if(nodo.getId() == n.getId()){
                aux = new Nodo();
                aux.setId(n.getId());
                aux.setNombre(n.getNombre());
            }
        }
        return aux;
    }
   /*agregar eiminar y editar*/ 
    public void deleteNodo(Nodo nodo){
        int i = 0;
        for(Nodo n:this.lista){
            if(nodo.getId() == n.getId()){
                this.lista.remove(i);
            }
            i++;
        } 
    }
    
    public void editar(Nodo nodo, int Id,String nombre){
        for(Nodo n:this.lista){
            if(nodo.getId() == n.getId()){
                nodo.setId(Id);
                nodo.setNombre(nombre);
            }
        }
    }
}
