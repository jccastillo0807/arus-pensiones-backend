package co.com.arus.pensiones.model.asesor.gateways;

import co.com.arus.pensiones.model.asesor.Asesor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AsesorRepository {
    Flux<Asesor> verTodos();
    Mono<Asesor> crear(Asesor asesor);

    Mono<Asesor> encontrarPorId(String id);
}
