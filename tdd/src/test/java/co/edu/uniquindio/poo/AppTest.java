/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas unitarias para la aplicación
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Test AssertEquals 
     */
    @Test
    public void testAssertEquals() {
        LOG.info("Inicio test assertEquals");
        int result = 2 + 3;
        assertEquals(5, result);
        LOG.info("Fin test assertEquals");
    }

    /**
     * Test AssertThrows 
     */
    @Test
    public void testAssertThrows() {
        LOG.info("Inicio test assertThrows");
        Calculadora calculadora = new Calculadora();
        assertThrows(Throwable.class, ()-> calculadora.divide(10, 0));
        LOG.info("Fin test assertThrows");
    }

    /**
     * Test AssertIterableEquals 
     */
    @Test
    public void testAssertIterableEquals() {
        LOG.info("Inicio test assertIterableEquals");
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(new Empleado("Juan", 35));
        empresa.agregarEmpleado(new Empleado("Ana", 28));
        empresa.agregarEmpleado(new Empleado("Luis", 40));

        // Lista esperada
        List<Empleado> empleadosEsperados = List.of(
            new Empleado("Juan", 35),
            new Empleado("Luis", 40)
        );

        // Llamamos al método obtenerEmpleadosMayoresDe30 y lo comparamos con la lista esperada
        assertIterableEquals(empleadosEsperados, empresa.obtenerEmpleadosMayoresDe30());

        LOG.info("Fin test assertIterableEquals");
    }

    /**
     * Test AssertTrue 
     */
    @Test
    public void testAssertTrue() {
        LOG.info("Inicio test assertTrue");
        int number = 5;
        assertTrue(number > 0);
        LOG.info("Fin test assertTrue");
    }
}
