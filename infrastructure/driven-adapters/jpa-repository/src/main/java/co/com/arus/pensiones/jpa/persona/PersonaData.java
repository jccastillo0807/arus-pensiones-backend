package co.com.arus.pensiones.jpa.persona;

import co.com.arus.pensiones.jpa.asesor.AsesorData;
import co.com.arus.pensiones.jpa.beneficiario.BeneficiarioData;
import co.com.arus.pensiones.jpa.causante.CausanteData;
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
@Table(name = "T_PERSONAS")
public class PersonaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @NotEmpty
    @Column(name = "numero_documento", length = 20)
    private String numeroDocumento;

    @NotEmpty
    @Column(name = "primer_nombre", length = 50)
    private String primerNombre;

    @NotEmpty
    @Column(name = "segundo_nombre", length = 50)
    private String segundoNombre;

    @NotEmpty
    @Column(name = "primer_apellido", length = 50)
    private String primerApellido;

    @NotEmpty
    @Column(name = "segundo_apellido", length = 50)
    private String segundoApellido;

    @NotEmpty
    @Column(name = "genero")
    private String genero;

//    @NotEmpty
    @Column(name = "vivo")
    private boolean vivo;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "fecha_deceso")
    private Date fechaDeceso;

    @OneToOne(mappedBy = "personaData")
    private AsesorData asesorData;

    @OneToOne(mappedBy = "personaData")
    private BeneficiarioData beneficiarioData;

    @OneToOne(mappedBy = "personaData")
    private CausanteData causanteData;

}
