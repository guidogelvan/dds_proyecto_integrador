package ar.edu.utn.frba.dds.domain;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable

public class Persistente implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
}