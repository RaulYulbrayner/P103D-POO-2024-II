package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    private Cliente cliente1;
    private Envio envio1, envio2, envio3;

    @Test
    //3a
    public void testCalcularCostoEnvioCamion() {
        LOG.info("Iniciando test: testCalcularCostoEnvioCamion");

        Cliente cliente = new Cliente("Raul", "12345", "raul@gmail.com", "Note");
        Vehiculo vehiculoCamion = new Camion("BBB234", "TOYOTA", "2021", 50);

        envio1 = new Envio("COD123", ZonaEntrega.RURAL, "2024-10-29", cliente, vehiculoCamion, 3,
                30);

        double expectedCosto = (3 * 12000) + (30 * 7000);
        double actualCosto = envio1.calcularCosto();

        assertEquals(expectedCosto, actualCosto, 0.01, "El costo del envío en Camión es incorrecto");

        LOG.info("Finalizando test: testCalcularCostoEnvioCamion");
    }

    @Test
    //3b
    public void testObtenerEnviosPesoMayor50() {
        LOG.info("Iniciando test: testObtenerEnviosPesoMayor50");

        List<Envio> envios = new LinkedList<>();
        Envio envioConPesoAlto = new Envio("E004", ZonaEntrega.RURAL, "20/10/2024", cliente1, camion, 5, 60);
        envios.add(envio1); // 30 kg
        envios.add(envio2); // 5 kg
        envios.add(envio3); // 5 kg
        envios.add(envioConPesoAlto); // 60 kg

        List<Envio> enviosPesoMayor50 = new LinkedList<>();
        for (Envio envio : envios) {
            if (envio.getPesoTotal() > 50) {
                enviosPesoMayor50.add(envio);
            }
        }

        List<Envio> listaEsperada = new LinkedList<>();
        listaEsperada.add(envioConPesoAlto);

        assertIterableEquals(listaEsperada, enviosPesoMayor50, "La lista debe contener solo el envío con peso alto");

        assertEquals(1, enviosPesoMayor50.size(), "La lista debe contener un solo elemento");

        LOG.info("Finalizando test: testObtenerEnviosPesoMayor50");
    }

}
