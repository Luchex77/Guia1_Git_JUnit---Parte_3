
package basededatos;

import java.util.ArrayList;
import modelos.BBDD;
import modelos.Dato;

public class BaseDeDatos {

    
    public static void main(String[] args) {
       
        BBDD lista=new BBDD();
        Dato dato;
        String id;
        
      
        dato =new Dato("id_1", "Dato A");
        lista.Agregar(dato);        
        dato =new Dato("id_2", "Dato B");
        lista.Agregar(dato);        
        dato =new Dato("id_3", "Dato C");
        lista.Agregar(dato);        
        ListarLibros(lista.Listar());
        
        System.out.println("******************************");      
        dato =new Dato("id_3", "Dato D");
        lista.Modificar(dato); 
        ListarLibros(lista.Listar());
        
        System.out.println("******************************");   
        id = "id_2";
        lista.Eliminar(id);
        ListarLibros(lista.Listar());
        
    }
    
    public static void ListarLibros(ArrayList<Dato> lista){
        for(Dato obj:lista){
            System.out.println("Id : "+obj.getId());
            System.out.println("Dato : "+obj.getDato());
            System.out.println("------------------------");
        }
    }
    
}
