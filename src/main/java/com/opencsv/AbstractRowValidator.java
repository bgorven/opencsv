package com.opencsv;

import com.opencsv.exceptions.CsvConstraintViolationException;

/**
 * The AbstractRowValidator is the parent class for all validators used by the CSVReader.
 * This will validate all the individual Strings in the array of String before it is returned
 * by the readNext method.
 *
 * @since 4.4
 */
public abstract class AbstractRowValidator implements IDataValidator<String[]> {
    @Override
    public abstract boolean isValid(String[] data);

    @Override
    public abstract void validate(String[] data) throws CsvConstraintViolationException;
}
