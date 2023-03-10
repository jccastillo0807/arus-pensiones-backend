package co.com.arus.pensiones.jpa.afiliacion;

import co.com.arus.pensiones.jpa.asesor.AsesorData;
import co.com.arus.pensiones.jpa.beneficiario.BeneficiarioData;
import co.com.arus.pensiones.jpa.causante.CausanteData;
import co.com.arus.pensiones.jpa.renta.RentaData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "T_AFILIACIONES")
public class AfiliacionData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_asesor", referencedColumnName = "id")
    private AsesorData asesorData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_causante", referencedColumnName = "id")
    private CausanteData causanteData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_beneficiario", referencedColumnName = "id")
    private BeneficiarioData beneficiarioData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_renta", referencedColumnName = "id")
    private RentaData rentaData;

    @NotEmpty
    @Column(name = "fecha_afiliacion")
    private Date fechaAfiliacion;

    @Column(name = "id_sbdcpc")
    private String idBaseDatosCentralPensionesColombia;
}
