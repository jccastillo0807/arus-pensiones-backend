package co.com.arus.pensiones.causante;

import co.com.arus.pensiones.causante.dto.CausanteDTO;
import co.com.arus.pensiones.usecase.causante.CausanteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = {"http://localhost:4200"}, methods = {RequestMethod.GET, RequestMethod.PATCH, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/causante")
@RequiredArgsConstructor
public class CausanteService {

    private final CausanteUseCase causanteUseCase;

    @GetMapping(path = "/lista", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<CausanteDTO> listarCausantes() {
        return causanteUseCase.encontrarCausantes()
                .map(CausanteConverter::construirRespuesta);
    }

    @PostMapping(path = "/crear-causante", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<CausanteDTO> guardarRegistro(@RequestBody CausanteDTO causante) {
        return causanteUseCase.registrarCausante(CausanteConverter.causanteDTOaCausante(causante))
                .map(CausanteConverter::construirRespuesta);
    }
}
