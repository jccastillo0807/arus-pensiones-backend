package co.com.arus.pensiones.model.causante.gateways;

import co.com.arus.pensiones.model.causante.Causante;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CausanteRepository {
    Flux<Causante> verTodos();
    Mono<Causante> crear(Causante causante);

    Mono<Causante> encontrarPorId(Integer id);

    Mono<Void> eliminar(Integer id);
}
