package com.opencsv;

import com.opencsv.exceptions.CsvConstraintViolationException;

/**
 * Classes that implement this interface may be used to validate the data being processed by
 * either the implementers of ICSVParser (CSVParser and RFC4180Parser) before the data is processed
 * or the CSVReader after being processed to check to see if the data is correct per the
 * implementors standards.
 *
 * @param <T> - The type of data being validated.
 * @since 4.4
 */
public interface IDataValidator<T> {
    /**
     * This is the code that validates the data.  This method is consumed by the validate
     * method but is exposed to the world in case the implementor wants to just check
     * the correctness of the data in a class of their own devising.
     *
     * @param data - Data to be validated.
     * @return true if data is valid, false otherwise.
     */
    boolean isValid(T data);

    /**
     * Validates the data and, depending on the implementor of the interface, will throw a
     * CsvConstraintViolationException.
     *
     * @param data
     * @throws CsvConstraintViolationException
     */
    void validate(T data) throws CsvConstraintViolationException;
}
