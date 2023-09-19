package ar.edu.utn.frba.dds.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@DiscriminatorValue("Persona Juridica")
public class PersonaJuridica extends Persona {
    @ElementCollection
    @CollectionTable(name="emails", joinColumns=@JoinColumn(name="persona_id"))
    @Column(name="emailsDeContacto")
    private List<String> emailsDeContacto;
    @Column(name = "fechaConstitucion", columnDefinition = "DATE")

    private LocalDate fechaConstitucion;
    @Column(name = "razonSocial")

    private String razonSocial;
    @ElementCollection
    @CollectionTable(name="telefonos", joinColumns=@JoinColumn(name="persona_id"))
    @Column(name="telefonosDeContacto")
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
