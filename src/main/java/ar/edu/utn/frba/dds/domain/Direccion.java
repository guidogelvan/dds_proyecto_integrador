package ar.edu.utn.frba.dds.domain;

import javax.persistence.*;

@Embeddable
public class Direccion {
    @Column(name = "altura")
    private Integer altura;
    @Column(name = "calle")
    private String calle;
    @Column(name = "localidad_barrio")
    private String localidadBarrio;
    @Column(name = "municipio_comuna")
    private String municipioComuna;
    @Column(name = "provincia")
    private String provincia;

    public String leyendaCompleta(){
        return null;
    }
}
