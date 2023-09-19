package ar.edu.utn.frba.dds.domain;

import java.time.LocalDate;
import java.util.List;

public class PersonaJuridica extends Persona {
    private List<String> emailseContacto;
    private LocalDate fechaConstitucion;
    private String razonSocial;
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
