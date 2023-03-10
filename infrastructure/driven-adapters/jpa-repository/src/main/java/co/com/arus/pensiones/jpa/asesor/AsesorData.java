package co.com.arus.pensiones.jpa.asesor;

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
@Table(name = "T_ASESORES")
public class AsesorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    private PersonaData personaData;

    @NotEmpty
    @Column(name = "usuario")
    private String usuario;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "asesorData")
    private List<AfiliacionData> afiliacionDataList;
}
