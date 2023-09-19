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
    @Column(name = "cuit_cuil")
    private String cuitCuil;
    @Embedded
    private Direccion direccion;

    @Column(name = "medio_comunicacion")
    @Convert(converter = MedioDeComunicacionConverter.class)
    private MedioDeComunicacion medioPreferido;

    public abstract String nombre();
}
