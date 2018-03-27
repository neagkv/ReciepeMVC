package reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reciepe.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * @author Kevin Neag
 */

public interface UnitOfMeasureRepo extends CrudRepository<UnitOfMeasure,Long>{

    Optional<UnitOfMeasure> findByDescription(String description);
}
