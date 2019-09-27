
package modelos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestModificar {
    
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Dato dato = null;
        BBDD instance = new BBDD();
        boolean expResult = false;
        boolean result = instance.Modificar(dato);
        assertEquals(expResult, result);
        
    }
    
}
