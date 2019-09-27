package modelo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author 56964
 */

@RunWith(Suite.class)
@SuiteClasses(
        {
            TestAgregar.class,
            TestModificar.class,
            TestListar.class,
            TestEliminar.class
        }
)
public class TestAll {
    
}
