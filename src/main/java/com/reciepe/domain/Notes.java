package com.reciepe.domain;

import lombok.Data;

import javax.persistence.*;

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
