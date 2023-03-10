package co.com.arus.pensiones.jpa.causante;

import co.com.arus.pensiones.jpa.afiliacion.AfiliacionData;
import co.com.arus.pensiones.jpa.persona.PersonaData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "T_CAUSANTES")
public class CausanteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    private PersonaData personaData;

    @NotEmpty
    @Column(name = "nit_empresa_afiliante")
    private String nitEmpresa;

    @NotEmpty
    @Column(name = "nombre_empresa_afiliante")
    private String nombreEmpresa;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "causanteData")
    private List<AfiliacionData> afiliacionDataList;

    public CausanteData() {
        this.afiliacionDataList=new ArrayList<>();
    }
}
