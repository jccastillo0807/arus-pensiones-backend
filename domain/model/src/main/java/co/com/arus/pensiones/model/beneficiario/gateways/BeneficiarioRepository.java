package co.com.arus.pensiones.model.beneficiario.gateways;

import co.com.arus.pensiones.model.beneficiario.Beneficiario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BeneficiarioRepository {
    Flux<Beneficiario> verTodos();
    Mono<Beneficiario> crear(Beneficiario beneficiario);

    Mono<Beneficiario> encontrarPorId(String id);
}
