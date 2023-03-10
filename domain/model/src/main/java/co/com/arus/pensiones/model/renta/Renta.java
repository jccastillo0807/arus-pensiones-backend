package co.com.arus.pensiones.model.renta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Renta {
    private Integer id;
    private Date fechaSolicitud;
    private Long salario;
    private Integer mesesCotizados;
}
