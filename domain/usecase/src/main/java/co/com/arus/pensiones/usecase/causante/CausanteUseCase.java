package co.com.arus.pensiones.usecase.causante;

import co.com.arus.pensiones.model.causante.Causante;
import co.com.arus.pensiones.model.causante.gateways.CausanteRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class CausanteUseCase {

private final CausanteRepository causanteRepository;

public Flux<Causante> encontrarCausantes(){
    return causanteRepository.verTodos();
}

}
