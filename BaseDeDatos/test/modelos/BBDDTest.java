
package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BBDDTest {
    
    public BBDDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testListar() {
        System.out.println("Listar");
        BBDD instance = new BBDD();
        ArrayList<Dato> expResult = null;
        ArrayList<Dato> result = instance.Listar();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Dato dato = null;
        BBDD instance = new BBDD();
        boolean expResult = false;
        boolean result = instance.Agregar(dato);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Dato dato = null;
        BBDD instance = new BBDD();
        boolean expResult = false;
        boolean result = instance.Modificar(dato);
        assertEquals(expResult, result);
        
    }

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
