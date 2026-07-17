package ar.edu.unahur.obj2.operaciones.criterios;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class AnalistaNivel1 implements ICriterioTriaje {

    @Override
    public Boolean acepta(Alerta unaAlerta) {
        return true;
    }

}
