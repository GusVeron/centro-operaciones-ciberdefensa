package ar.edu.unahur.obj2.operaciones;

import java.util.ArrayList;
import java.util.List;

public class Analista {

    private final String legajo;
    private final List<Alerta> alertasProcesadas = new ArrayList<>();


    public Analista(String legajo) {
        this.legajo = legajo;
    }
    
    public String getLegajo() {
        return legajo;
    }

    // Devuelvo una copia de mi atributo de lista de alertas procesadas.
    // Decidi devolver de esta forma la lista para evitar que cualquiera pueda usar clear() y borrar toda la lista.
    // Tambien pongo en practica el encapsulamiento.
    public List<Alerta> alertasProcesadas() {
        return List.copyOf(alertasProcesadas);
    }

    public void procesarAlerta(Alerta unaAlerta) {
        alertasProcesadas.add(unaAlerta);
    }
    
}
