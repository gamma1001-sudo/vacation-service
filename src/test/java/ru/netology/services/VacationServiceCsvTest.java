package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacationServiceCsvTest {
    private final VacationService service = new VacationService();

    @ParameterizedTest(name = "{index}: income={1}, expenses={2}, threshold={3} -> {0}")
    @CsvFileSource(resources = "/vacation-cases.csv", numLinesToSkip = 1)
    void shouldCalculateRestMonthsFromCsv(
            int expected,
            int income,
            int expenses,
            int threshold
    ) {
        assertEquals(expected, service.calculate(income, expenses, threshold));
    }
}
