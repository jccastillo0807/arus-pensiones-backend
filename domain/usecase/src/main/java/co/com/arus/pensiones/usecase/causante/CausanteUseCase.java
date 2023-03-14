package co.com.arus.pensiones.usecase.causante;

import co.com.arus.pensiones.model.causante.Causante;
import co.com.arus.pensiones.model.causante.gateways.CausanteRepository;
import co.com.arus.pensiones.model.persona.gateways.PersonaRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CausanteUseCase {

    private final CausanteRepository causanteRepository;
    private final PersonaRepository personaRepository;

    public Flux<Causante> encontrarCausantes() {
        return causanteRepository.verTodos();
    }

    public Mono<Causante> registrarCausante(Causante causante){
        return personaRepository.crear(causante.getPersona())
                .flatMap(
                        persona -> causanteRepository.crear(causante)

                );

//                causanteRepository.crear(causante);
    }

}
