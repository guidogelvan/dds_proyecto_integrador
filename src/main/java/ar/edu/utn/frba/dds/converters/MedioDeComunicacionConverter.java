package ar.edu.utn.frba.dds.converters;

import ar.edu.utn.frba.dds.domain.medioDeComunicacion.Email;
import ar.edu.utn.frba.dds.domain.medioDeComunicacion.MedioDeComunicacion;
import ar.edu.utn.frba.dds.domain.medioDeComunicacion.Telegram;
import ar.edu.utn.frba.dds.domain.medioDeComunicacion.Whatsapp;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MedioDeComunicacionConverter implements AttributeConverter<MedioDeComunicacion, String> {
    @Override
    public String convertToDatabaseColumn(MedioDeComunicacion medioDeComunicacion) {
        String nombreEstrategia = "";
        switch (medioDeComunicacion.getClass().getName()){
            case "Email": nombreEstrategia = "email"; break;
            case "Whatsapp": nombreEstrategia = "wpp"; break;
            case "Telegram": nombreEstrategia = "telegram"; break;
        }
        return nombreEstrategia;
    }

    @Override
    public MedioDeComunicacion convertToEntityAttribute(String s) {
        MedioDeComunicacion medio = null;
        if(s == "wpp")
            medio = new Whatsapp();
        if(s == "email")
            medio = new Email();
        if (s == "telegram")
            medio = new Telegram();
        return medio;
    }
}
