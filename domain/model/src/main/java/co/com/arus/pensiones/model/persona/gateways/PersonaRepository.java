package co.com.arus.pensiones.model.persona.gateways;

import co.com.arus.pensiones.model.persona.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonaRepository {
    Flux<Persona> verTodos();
    Mono<Persona> crear(Persona persona);

    Mono<Persona> encontrarPorId(Integer id);

    Mono<Void> eliminar(Integer id);
}
