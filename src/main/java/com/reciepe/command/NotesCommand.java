package com.reciepe.command;

import com.reciepe.domain.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Kevin Neag
 */

@NoArgsConstructor
@Setter
@Getter
public class NotesCommand {

    private Long id;
    private Recipe recipe;
    private String recipeNotes;

}
