package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.converters.MedioDeComunicacionConverter;
import ar.edu.utn.frba.dds.domain.medioDeComunicacion.MedioDeComunicacion;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")

public abstract class Persona implements Contactable {
    @EmbeddedId
    private Persistente id;
    @Column(name = "cuitCuil")
    private String cuitCuil;
    @Embedded
    private Direccion direccion;

    @Convert(converter = MedioDeComunicacionConverter.class)
    private MedioDeComunicacion medioPreferido;

    public abstract String nombre();
}
