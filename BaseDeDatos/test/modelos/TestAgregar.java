
package modelos;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestAgregar {
    
     @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Dato dato=new Dato("001",this);
        BBDD instance=new BBDD();
        boolean esperado=true;
        boolean obtenido=instance.Agregar(dato);
        Assert.assertEquals(esperado,obtenido);
        
        
    }
    
}
