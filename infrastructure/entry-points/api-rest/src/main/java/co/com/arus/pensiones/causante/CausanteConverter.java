package co.com.arus.pensiones.causante;

import co.com.arus.pensiones.causante.dto.CausanteDTO;
import co.com.arus.pensiones.model.causante.Causante;

public class CausanteConverter {

    private CausanteConverter() {
        throw new IllegalStateException("Utility class");
    }

    public static CausanteDTO construirRespuesta(Causante causante){
        CausanteDTO causanteDTO = new CausanteDTO();
        causanteDTO.setId(causante.getId());
        causanteDTO.setNitEmpresa(causante.getNitEmpresa());
        causanteDTO.setNombreEmpresa(causante.getNombreEmpresa());
        causanteDTO.setPersona(causante.getPersona());

        return causanteDTO;
    }

    public static Causante causanteDTOaCausante(CausanteDTO causanteDTO){
        return Causante.builder()
                .id(causanteDTO.getId() != null ? causanteDTO.getId() : null)
                .nombreEmpresa(causanteDTO.getNombreEmpresa())
                .nitEmpresa(causanteDTO.getNitEmpresa())
                .persona(causanteDTO.getPersona())
                .build();
    }
}
