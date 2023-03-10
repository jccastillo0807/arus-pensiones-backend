package co.com.arus.pensiones.model.afiliacion.gateways;

import co.com.arus.pensiones.model.afiliacion.Afiliacion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AfiliacionRepository {
    Flux<Afiliacion> verTodas();
    Mono<Afiliacion> crearAfiliacion(Afiliacion afiliacion);

    Mono<Afiliacion> encontrarPorId(String id);

    Mono<Afiliacion> eliminarPorId(Integer id);
}
