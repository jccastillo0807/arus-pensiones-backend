package co.com.arus.pensiones.model.renta.gateways;

import co.com.arus.pensiones.model.renta.Renta;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RentaRepository {
    Flux<Renta> verTodos();
    Mono<Renta> crear(Renta renta);
}
