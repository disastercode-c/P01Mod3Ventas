package modelo;

import junit.framework.Assert;
import org.junit.Test;

public class TestAgregar {
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta = new Venta("v001", 3000, 3);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado=true;
        boolean obtenido=instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
}
