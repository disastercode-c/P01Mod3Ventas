package modelo;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestSubTotal {
    
    @Test
    public void testSubTotal(){
        System.out.println("Sub Total");
        ColeccionVentas instance = new ColeccionVentas();
        int esperado = 15000;
        int obtenido = instance.subTotal(5000,3);
        Assert.assertEquals(esperado, obtenido);
    }
}
