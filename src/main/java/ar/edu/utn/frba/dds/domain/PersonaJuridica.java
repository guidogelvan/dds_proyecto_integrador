package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.converters.LocalDateConverter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@DiscriminatorValue("persona_juridica")
public class PersonaJuridica extends Persona {
    @ElementCollection
    @CollectionTable(name="email_contacto", joinColumns=@JoinColumn(name="persona_id"))
    @Column(name = "email")
    private List<String> emailsDeContacto;
    @Column(name = "fecha_nacimiento", columnDefinition = "DATE")
    @Convert(converter = LocalDateConverter.class)
    private LocalDate fechaConstitucion;
    @Column(name = "razon_social")
    private String razonSocial;
    @ElementCollection
    @CollectionTable(name = "telefono_contacto", joinColumns = @JoinColumn(name = "persona_id"))
    @Column(name = "telefono")
    private List<String> telefonosDeContacto;


    @Override
    public String nombre() {
        return null;
    }

    @Override
    public String emailPreferido() {
        return null;
    }

    @Override
    public String numeroPreferido() {
        return null;
    }
}
