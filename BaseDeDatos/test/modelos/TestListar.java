
package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestListar {
    
    @Test
  public void testListar(){
      System.out.println("Listar");
      BBDD instance=new BBDD();
      ArrayList<Dato> esperado= new ArrayList<>();
      ArrayList<Dato> obtenido=instance.Listar();
      Assert.assertEquals(esperado,obtenido);
      
  }
}
