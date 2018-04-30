package com.reciepe.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Kevin Neag
 */

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {

    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

}
