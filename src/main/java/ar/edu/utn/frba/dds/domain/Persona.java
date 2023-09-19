package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.medioDeComunicacion.MedioDeComunicacion;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")

public abstract class Persona implements Contactable{
    @EmbeddedId
    private Persistente id;
    @Column(name = "cuitCuil")
    private String cuitCuil;
    @Column(name = "direccion")
    private Direccion direccion;
    @Column(name = "medioPreferido")
    private MedioDeComunicacion medioPreferido;

    public abstract String nombre();
}
