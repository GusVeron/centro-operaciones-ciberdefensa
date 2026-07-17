package ar.edu.unahur.obj2.operaciones;


public class Alerta {

    private String codigoIdentificador;
    private String ipDeOrigen;
    private Integer severidadBase;
    private Long tiempoDeteccion;


    public Alerta(String codigoIdentificador, String ipDeOrigen, Integer severidadBase, Long tiempoDeteccion) {

        this.codigoIdentificador = codigoIdentificador;
        this.ipDeOrigen = ipDeOrigen;
        this.severidadBase = severidadBase;
        this.tiempoDeteccion = tiempoDeteccion;
    }



    public String getCodigo() {
        return codigoIdentificador;
    }

    public String getIpDeOrigen() {
        return ipDeOrigen;
    }

    public Integer getSeveridadBase() {
        return severidadBase;
    }

    public Long getTiempoDeteccion() {
        return tiempoDeteccion;
    }

    // Metodo Booleano que me resuelve la problematica de si una alerta es critica o no!!.
    public Boolean esCritica() {
        return severidadBase > 90;
    }
    
    

}
