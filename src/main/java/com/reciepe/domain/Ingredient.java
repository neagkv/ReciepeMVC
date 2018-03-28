package com.reciepe.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Kevin Neag
 */
@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Ingredient(String ripe_avocados, BigDecimal bigDecimal, UnitOfMeasure eachUom) {
    }

    public Ingredient(Long id, String description, BigDecimal amount, UnitOfMeasure uom) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

}
