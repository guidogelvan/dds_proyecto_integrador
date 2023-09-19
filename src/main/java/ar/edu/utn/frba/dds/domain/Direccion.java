package ar.edu.utn.frba.dds.domain;

import javax.persistence.*;

@Embeddable

public class Direccion{


    @Column(name = "altura")
    private Integer altura;
    @Column(name = "calle")
    private String calle;
    @Column(name = "localidadBarrio")
    private String localidadBarrio;
    @Column(name = "municipioComuna")
    private String municipioComuna;
    @Column(name = "provincia")
    private String provincia;

    public String leyendaCompleta(){
        return null;
    }
}
