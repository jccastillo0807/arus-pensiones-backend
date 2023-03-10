package co.com.arus.pensiones.jpa.renta;

import co.com.arus.pensiones.jpa.afiliacion.AfiliacionData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "T_RENTAS")
public class RentaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "fecha_solicitud")
    private Date fechaSolicitud;

    @NotEmpty
    @Column(name = "salario")
    private long salario;

    @NotEmpty
    @Column(name = "meses_cotizados")
    private int mesesCotizados;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "rentaData")
    private List<AfiliacionData> afiliacionDataList;
}
