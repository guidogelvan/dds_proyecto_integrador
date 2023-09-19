package ar.edu.utn.frba.dds.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("Persona Fisica")
public class PersonaFisica extends Persona {
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fechaNacimiento", columnDefinition = "DATE")
    private LocalDate fechaNacimiento;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public String emailPreferido() {
        return this.email;
    }

    @Override
    public String numeroPreferido() {
        return this.telefono;
    }
}
