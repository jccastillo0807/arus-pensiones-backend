package co.com.arus.pensiones.jpa.persona;

import co.com.arus.pensiones.jpa.helper.AdapterOperations;
import co.com.arus.pensiones.model.persona.Persona;
import co.com.arus.pensiones.model.persona.gateways.PersonaRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class PersonaRepositoryAdapter extends AdapterOperations<Persona, PersonaData, Integer, PersonaDataRepository>
        implements PersonaRepository {

    @Autowired
    public PersonaRepositoryAdapter(PersonaDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Persona.PersonaBuilder.class).build());
    }

    @Override
    public Flux<Persona> verTodos() {
        return doQueryMany(repository::findAll);
    }

    @Override
    public Mono<Persona> crear(Persona persona) {
        return Mono.just(save(persona));
    }

    @Override
    public Mono<Persona> encontrarPorId(Integer id) {
        if (id == null || id.equals("")) {
            return Mono.empty();
        }
        return Mono.just(
                findById(id)
        );
    }

    @Override
    public Mono<Void> eliminar(Integer id) {
        return null;
    }
}
