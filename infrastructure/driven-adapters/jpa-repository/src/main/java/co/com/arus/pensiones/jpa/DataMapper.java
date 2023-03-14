package co.com.arus.pensiones.jpa;

import co.com.arus.pensiones.jpa.causante.CausanteData;
import co.com.arus.pensiones.jpa.persona.PersonaData;
import co.com.arus.pensiones.model.causante.Causante;
import co.com.arus.pensiones.model.persona.Persona;

import java.util.ArrayList;
import java.util.List;

public class DataMapper {
    private DataMapper() {
        throw new IllegalStateException("Utility class");
    }

    public static Causante convertirCausanteDataACausante(CausanteData causanteData) {
        return Causante.builder()
                .id(causanteData.getId())
                .persona(convertirPersonaDataAPersona(causanteData.getPersonaData()))
                .nitEmpresa(causanteData.getNitEmpresa())
                .nombreEmpresa(causanteData.getNombreEmpresa())
                .build();
    }

    public static CausanteData convertirCausanteACausanteData(Causante causante) {
        return CausanteData.builder()
                .id(causante.getId())
                .personaData(convertirPersonaAPersonaData(causante.getPersona()))
                .nitEmpresa(causante.getNitEmpresa())
                .nombreEmpresa(causante.getNombreEmpresa())
                .build();
    }

    public static Persona convertirPersonaDataAPersona(PersonaData personaData) {
        return Persona.builder()
                .id(personaData.getId())
                .tipoDocumento(personaData.getTipoDocumento())
                .numeroDocumento(personaData.getNumeroDocumento())
                .primerNombre(personaData.getPrimerNombre())
                .segundoNombre(personaData.getSegundoNombre())
                .primerApellido(personaData.getPrimerApellido())
                .segundoApellido(personaData.getSegundoApellido())
                .genero(personaData.getGenero())
                .vivo(personaData.isVivo())
                .fechaNacimiento(personaData.getFechaNacimiento())
                .fechaDeceso(personaData.getFechaDeceso())
                .build();
    }

    public static PersonaData convertirPersonaAPersonaData(Persona persona) {
        return PersonaData.builder()
                .id(persona.getId())
                .tipoDocumento(persona.getTipoDocumento())
                .numeroDocumento(persona.getNumeroDocumento())
                .primerNombre(persona.getPrimerNombre())
                .segundoNombre(persona.getSegundoNombre())
                .primerApellido(persona.getPrimerApellido())
                .segundoApellido(persona.getSegundoApellido())
                .genero(persona.getGenero())
                .vivo(persona.getVivo())
                .fechaNacimiento(persona.getFechaNacimiento())
                .fechaDeceso(persona.getFechaDeceso())
                .build();
    }



    public static List<Causante> convertirIterableCausanteDataAListCausante(Iterable<CausanteData> causanteDataIterable) {
        List<Causante> listaCausantes = new ArrayList<>();
        causanteDataIterable.forEach(
                causanteData -> listaCausantes.add(
                        convertirCausanteDataACausante(causanteData)
                )
        );
        return listaCausantes;
    }
}
