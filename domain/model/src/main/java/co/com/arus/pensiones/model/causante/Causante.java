package co.com.arus.pensiones.model.causante;

import co.com.arus.pensiones.model.persona.Persona;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Causante {
    private Integer id;
    private Persona persona;
    private String nitEmpresa;
    private String nombreEmpresa;
}
