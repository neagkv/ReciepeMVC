package com.reciepe.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Kevin Neag
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
