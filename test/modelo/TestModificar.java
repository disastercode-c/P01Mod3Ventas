/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import junit.framework.Assert;
import org.junit.Test;


public class TestModificar {
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Venta venta = new Venta("v001", 5000,3);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        venta = new Venta("v001", 5000, 3 );
        boolean obtenido=instance.Modificar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}
