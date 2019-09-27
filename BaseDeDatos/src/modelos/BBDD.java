
package modelos;

import java.util.ArrayList;

public class BBDD {
    
    
    private ArrayList<Dato> datos;
    

    public BBDD(){
        this.datos=new ArrayList<Dato>();
    }
    
    public ArrayList<Dato> Listar(){
      return this.datos;
    }
    
    
    public boolean Agregar(Dato dato){
        return this.datos.add(dato);
    }
    
          
    public boolean Modificar(Dato dato){
        for(int i=0;i<datos.size ();i++){
        if(datos.get(i).getId().equals(dato.getId())){
            datos.get(i).setId(dato.getId());
            datos.get(i).setDato(dato.getDato());
            
            return true;
            
        }
        }return false;
}
    
    public boolean Eliminar(String id){
        for(int i=0;i<datos.size();i++){
        if(datos.get(i).getId().equals(id)){
            datos.remove(i);
            return true;
            
        }
        
    }
       return false;
    }
     
}