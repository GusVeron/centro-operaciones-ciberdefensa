package ar.edu.unahur.obj2.operaciones.criterios;

import java.util.List;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class DefensaHibrida implements ICriterioTriaje {

    private final ICriterioTriaje amenazas;
    private final ICriterioTriaje infraestructura;

    public DefensaHibrida(List<String> ipsCriticas) {
        this.amenazas = new AmenazasCriticas();
        this.infraestructura = new EspecialistaInfraestructura(ipsCriticas);
    }

    @Override
    public Boolean acepta(Alerta unaAlerta) {
        return amenazas.acepta(unaAlerta) || infraestructura.acepta(unaAlerta);
    }

}
