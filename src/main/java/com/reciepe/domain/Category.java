package com.reciepe.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Kevin Neag
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipe;

}
