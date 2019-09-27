package modelo;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestListar {
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<Venta>();
        ArrayList<Venta> obtenido = instance.Listar();
        Assert.assertEquals(esperado, obtenido);
        
    }
}
