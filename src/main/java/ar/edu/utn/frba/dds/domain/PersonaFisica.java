package ar.edu.utn.frba.dds.domain;

import java.time.LocalDate;

public class PersonaFisica extends Persona {
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String email;
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
