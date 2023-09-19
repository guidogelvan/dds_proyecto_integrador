package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.medioDeComunicacion.MedioDeComunicacion;

public abstract class Persona implements Contactable{
    private String cuitCuil;
    private Direccion direccion;
    private MedioDeComunicacion medioPreferido;

    public abstract String nombre();
}
