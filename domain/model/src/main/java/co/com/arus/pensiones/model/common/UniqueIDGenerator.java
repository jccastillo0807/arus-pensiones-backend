
package co.com.arus.pensiones.model.common;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.UUID;

import static reactor.core.publisher.Mono.fromSupplier;

public class UniqueIDGenerator {

    private UniqueIDGenerator() {
    }

    public static Mono<String> uuid(){
        return fromSupplier(() -> UUID.randomUUID().toString());
    }

    public static String uuidString(){
        return UUID.randomUUID().toString();
    }
    public static Flux<String> uuids(){
        return Flux.generate(sink -> sink.next(UUID.randomUUID().toString()));
    }

    public static Mono<Date> now(){
        return fromSupplier(Date::new);
    }
}
