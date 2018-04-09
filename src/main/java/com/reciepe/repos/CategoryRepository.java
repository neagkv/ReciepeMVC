package com.reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import com.reciepe.domain.Category;

import java.util.Optional;

/**
 * @author Kevin Neag
 */

public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
