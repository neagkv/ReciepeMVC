package com.reciepe.repos;

import org.springframework.data.repository.CrudRepository;
import com.reciepe.domain.Category;

import java.util.Optional;

/**
 * @author Kevin Neag
 */

public interface CategoryRepo extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
