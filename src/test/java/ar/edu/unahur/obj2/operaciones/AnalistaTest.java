package ar.edu.unahur.obj2.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class AnalistaTest {

    // 1)
    @Test
    public void unAnalistaRecienCreadoConoceSuLegajo() {

        Analista analista1 = new Analista("A111");

        assertEquals("A111", analista1.getLegajo());
    }

    // 2)
    @Test
    public void seCreaUnAnalistaSinAlertasProcesadas() {

        Analista analista1 = new Analista("A111");

        assertTrue(analista1.alertasProcesadas().isEmpty());
    }

    // 3)
    @Test
    public void seCreaUnAnalistaYEsteRecibeUnaAlerta() {

        Alerta alerta1 = new Alerta("CVE-2024-123", "192.168.0.1", 80, 1400L);
        Analista analista1 = new Analista("A111");

        analista1.procesarAlerta(alerta1);

        assertEquals(1, analista1.alertasProcesadas().size());
    }
}
