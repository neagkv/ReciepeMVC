package com.reciepe.command;

import com.reciepe.domain.Recipe;
import com.reciepe.domain.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Kevin Neag
 */

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {

    private Long id;
    private Long recipeId;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;




}
