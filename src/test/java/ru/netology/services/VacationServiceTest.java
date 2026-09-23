package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacationServiceTest {
    private final VacationService service = new VacationService();

    @Test
    void shouldCalculateThreeRestMonths() {
        assertEquals(3, service.calculate(10_000, 3_000, 20_000));
    }

    @Test
    void shouldCalculateTwoRestMonths() {
        assertEquals(2, service.calculate(100_000, 60_000, 150_000));
    }
}
