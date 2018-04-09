package com.reciepe.domain;

import javax.persistence.*;
import lombok.Data;

/**
 * @author Kevin Neag
 */

@Data
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
