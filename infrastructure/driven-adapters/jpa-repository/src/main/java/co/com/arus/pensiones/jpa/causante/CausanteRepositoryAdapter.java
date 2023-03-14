package co.com.arus.pensiones.jpa.causante;

import co.com.arus.pensiones.jpa.DataMapper;
import co.com.arus.pensiones.jpa.helper.AdapterOperations;
import co.com.arus.pensiones.model.causante.Causante;
import co.com.arus.pensiones.model.causante.gateways.CausanteRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Repository
public class CausanteRepositoryAdapter extends AdapterOperations<Causante, CausanteData, Integer, CausanteDataRepository>
        implements CausanteRepository {

    @Autowired
    public CausanteRepositoryAdapter(CausanteDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Causante.CausanteBuilder.class).build());
    }

    @Override
    public Flux<Causante> verTodos() {
        return Flux.fromIterable(
                DataMapper.convertirIterableCausanteDataAListCausante(repository.findAll())
        );
    }

    @Override
    public Mono<Causante> crear(Causante causante) {
        if (Objects.isNull(causante)) {
            return Mono.empty();
        }
        return Mono.just(DataMapper.convertirCausanteDataACausante(
                repository.save(DataMapper.convertirCausanteACausanteData(causante))
        ));
    }

    @Override
    public Mono<Causante> encontrarPorId(Integer id) {
        if (id == null || id.equals("")) {
            return Mono.empty();
        }
        return Mono.just(findById(id));
    }

    @Override
    public Mono<Void> eliminar(Integer id) {
        if (id != null) {
            repository.deleteById(id);
        }
        return Mono.empty();
    }
}
