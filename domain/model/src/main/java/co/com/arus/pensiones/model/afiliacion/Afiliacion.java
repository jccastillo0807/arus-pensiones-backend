package co.com.arus.pensiones.model.afiliacion;


import co.com.arus.pensiones.model.asesor.Asesor;
import co.com.arus.pensiones.model.beneficiario.Beneficiario;
import co.com.arus.pensiones.model.causante.Causante;
import co.com.arus.pensiones.model.renta.Renta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Afiliacion {
    private Integer id;
    private Asesor asesor;
    private Causante causante;
    private Beneficiario beneficiario;
    private Renta renta;
    private Date fechaAfiliacion;
    private String idBaseDatosCentralPensionesColombia;
}
