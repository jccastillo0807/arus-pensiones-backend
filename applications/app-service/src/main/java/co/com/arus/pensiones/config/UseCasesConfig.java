package co.com.arus.pensiones.config;

import co.com.arus.pensiones.model.causante.gateways.CausanteRepository;
import co.com.arus.pensiones.model.persona.gateways.PersonaRepository;
import co.com.arus.pensiones.usecase.causante.CausanteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.arus.pensiones.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

        @Bean
        public CausanteUseCase getCausanteUseCase(CausanteRepository causanteRepository, PersonaRepository personaRepository){
                return new CausanteUseCase(causanteRepository, personaRepository);
        }
}
