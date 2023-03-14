package co.com.arus.pensiones.causante.dto;

import co.com.arus.pensiones.model.persona.Persona;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CausanteDTO implements Serializable {
    private Integer id;
    private Persona persona;
    private String nitEmpresa;
    private String nombreEmpresa;

    private static final long serialVersionUID = 1L;
}
