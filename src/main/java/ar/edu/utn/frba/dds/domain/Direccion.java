package ar.edu.utn.frba.dds.domain;

import javax.persistence.*;


public class Direccion{

    private Long id;
    private Integer altura;
    private String calle;
    private String localidadBarrio;
    private String municipioComuna;
    private String provincia;

    public String leyendaCompleta(){
        return null;
    }
}
