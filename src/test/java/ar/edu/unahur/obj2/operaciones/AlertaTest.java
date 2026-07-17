package ar.edu.unahur.obj2.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlertaTest {

    // 1)
    @Test
    public void unaAlertaRecienCreadaConoceSuCodigo() {
        
        Alerta alerta1 = new Alerta("CVE-2024-123", "192.168.0.1", 80, 1400L);

        assertEquals("CVE-2024-123", alerta1.getCodigo());
    }

    // 2)
    @Test
    public void unaAlertaRecienCreadaConoceSuSeveridadBase() {
        
        Alerta alerta1 = new Alerta("CVE-2024-123", "192.168.0.1", 80, 1400L);

        assertEquals(80, alerta1.getSeveridadBase());
    }

    // 3) Aparece el primer comportamiento de la clase Alerta. Chequeo con assertFalse.
    @Test
    public void unaAlertaConSeveridadDeNoventaOMenosNoEsCritica() {
        
        Alerta alerta1 = new Alerta("CVE-2024-123", "192.168.0.1", 80, 1400L);
        
        assertFalse(alerta1.esCritica());
    }
    
    // 4) Chequeo con assertTrue el caso borde.
    @Test
    public void unaAlertaConSeveridadDeMasDeNoventaEsCritica() {
        
        Alerta alerta1 = new Alerta("CVE-2024-123", "192.168.0.1", 91, 1400L);

        assertTrue(alerta1.esCritica());
    }

}
