package es.vass.kata3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class MathUtilsTest {

    private static final Integer[] MULT = new Integer[]{3,5};

    private static final Integer TEN_LIMIT = 10;
    private static final Long SUM_SOLUTION_UNDER_TEN = 23L;

    private static final Integer THOUSAND_LIMIT = 1000;
    private static final Long SUM_SOLUTION_UNDER_THOUSAND = 233_168L;

    private static final Long FIBONACCI_LIMIT = 4_000_000L;
    private static final Long SUM_FIBONACCI_EVEN_UNDER_FOUR_MILLIONS = 4_613_732L;

    @DisplayName("Test MathUtils.findMultiplesUnder using 10 as limit and 3 and 5 as multiples")
    @Test
    void testMultiplesUnderTen() {
        Long sum = MathUtils.findMultiplesUnder(TEN_LIMIT, MULT);
        assertEquals(SUM_SOLUTION_UNDER_TEN,sum);
    }

    @DisplayName("Test MathUtils.findMultiplesUnder using 1000 as limit and 3 and 5 as multiples")
    @Test
    void testMultiplesUnderThousand() {
        Long sum = MathUtils.findMultiplesUnder(THOUSAND_LIMIT, MULT);
        assertEquals(SUM_SOLUTION_UNDER_THOUSAND,sum);

    }

    @DisplayName("Test MathUtils.fibonacciEvenSumUnder 4 million")
    @Test
    void testFibonacciEvenSumUnder() {
        assertEquals(SUM_FIBONACCI_EVEN_UNDER_FOUR_MILLIONS,MathUtils.fibonacciEvenSumUnder(FIBONACCI_LIMIT));
    }

}
