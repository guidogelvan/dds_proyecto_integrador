package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.converters.LocalDateConverter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("persona_fisica")
public class PersonaFisica extends Persona {
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha_nacimiento")
    @Convert(converter = LocalDateConverter.class)
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
