package com.reciepe.domain;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Kevin Neag
 */

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
