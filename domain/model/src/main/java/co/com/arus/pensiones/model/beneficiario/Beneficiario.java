package co.com.arus.pensiones.model.beneficiario;

import co.com.arus.pensiones.model.persona.Persona;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Beneficiario {
    private Integer id;
    private Persona persona;
    private TipoBeneficiario tipoBeneficiario;
    private Boolean estudiaActualmente;
    private Boolean dependeCausante;
    private Long mesadaPensional;
}
