package com.reciepe.service;

import com.reciepe.command.UnitOfMeasureCommand;

import java.util.Set;

/**
 * @author Kevin Neag
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
