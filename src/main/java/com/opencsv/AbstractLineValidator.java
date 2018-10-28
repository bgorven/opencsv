package com.opencsv;

import com.opencsv.exceptions.CsvConstraintViolationException;

/**
 * The AbstractLineValidator is the parent class for all validators used by the Parsers.
 * Because this is using a single line read from the data source I would advise against
 * using this unless you really know or want strict control over the data source.
 *
 * @since 4.4
 */
public abstract class AbstractLineValidator implements IDataValidator<String> {
    @Override
    public abstract boolean isValid(String data);

    @Override
    public abstract void validate(String data) throws CsvConstraintViolationException;
}
