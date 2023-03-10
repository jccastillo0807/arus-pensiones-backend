package co.com.arus.pensiones.jpa.beneficiario;

import co.com.arus.pensiones.jpa.afiliacion.AfiliacionData;
import co.com.arus.pensiones.jpa.persona.PersonaData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "T_BENEFICIARIOS")
public class BeneficiarioData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    private PersonaData personaData;

    @NotEmpty
    @Column(name = "tipo_beneficiario")
    private String tipoBeneficiario;

    @NotEmpty
    @Column(name = "estudia_actualmente")
    private Boolean estudiaActualmente;

    @NotEmpty
    @Column(name = "depende_causante")
    private Boolean dependeCausante;

    @NotEmpty
    @Column(name = "mesada_pensional")
    private long mesadaPensional;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "beneficiarioData")
    private List<AfiliacionData> afiliacionDataList;

    /*public BeneficiarioData() {
        this.afiliacionDataList=new ArrayList<>();
    }*/
}
