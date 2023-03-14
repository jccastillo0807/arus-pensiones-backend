package co.com.arus.pensiones.jpa.causante;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface CausanteDataRepository extends CrudRepository<CausanteData, Integer>, QueryByExampleExecutor<CausanteData> {
}
