package ar.edu.utn.frba.dds.domain.medioDeComunicacion;

import ar.edu.utn.frba.dds.domain.Contactable;

public interface MedioDeComunicacion{
    public void enviarAviso(String a, Contactable contactable);
}
