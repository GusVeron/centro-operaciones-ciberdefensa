package ar.edu.unahur.obj2.operaciones.criterios;

import java.util.List;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class EspecialistaInfraestructura implements ICriterioTriaje{

    private List<String> ipsCriticas;

    public EspecialistaInfraestructura(List<String> ipsCriticas) {
        this.ipsCriticas = List.copyOf(ipsCriticas);
    }

    @Override
    public Boolean acepta(Alerta unaAlerta) {
        return ipsCriticas.contains(unaAlerta.getIpDeOrigen());
    } 

}
