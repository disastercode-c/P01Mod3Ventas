/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author 56964
 */
public class TestEliminar {
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String cod="v001";
        Venta venta = new Venta("v001", 5000,3);
        ColeccionVentas instance=new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(cod);
        Assert.assertEquals(esperado, obtenido);
    }
}
