package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.converters.MedioDeComunicacionConverter;
import ar.edu.utn.frba.dds.domain.medioDeComunicacion.MedioDeComunicacion;

import javax.persistence.Convert;
import javax.persistence.Entity;

@Entity
public abstract class Persona implements Contactable{
    private String cuitCuil;
    private Direccion direccion;
    @Convert(converter = MedioDeComunicacionConverter.class)
    private MedioDeComunicacion medioPreferido;

    public abstract String nombre();
}
