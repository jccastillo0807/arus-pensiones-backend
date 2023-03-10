package co.com.arus.pensiones.model.asesor;

import co.com.arus.pensiones.model.persona.Persona;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Asesor {
    private Integer id;
    private Persona persona;
    private String usuario;
    private String rol;
}
