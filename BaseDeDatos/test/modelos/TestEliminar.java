
package modelos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestEliminar {
    
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String id = "";
        BBDD instance = new BBDD();
        boolean expResult = false;
        boolean result = instance.Eliminar(id);
        assertEquals(expResult, result);
        
    }
    
}
