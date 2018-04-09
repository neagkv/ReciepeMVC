package com.reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import com.reciepe.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * @author Kevin Neag
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long>{

    Optional<UnitOfMeasure> findByDescription(String description);
}
