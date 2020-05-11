package es.vass.kata3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class MathUtilsTest {

    private static final Integer[] MULT = new Integer[]{3,5};

    private static final Integer TEN_LIMIT = 10;
    private static final List<Integer> SOLUTION_UNDER_TEN = Arrays.asList(new Integer[]{3, 5, 6, 9});
    private static final Integer SUM_SOLUTION_UNDER_TEN = 23;

    private static final Integer THOUSAND_LIMIT = 1000;
    private static final Long SUM_SOLUTION_UNDER_THOUSAND = 233168L;

    @DisplayName("Test MathUtils.findMultiplesUnder using 10 as limit and 3 and 5 as multiples")
    @Test
    void testMultiplesUnderTen() {
        List<Integer> multiples = MathUtils.findMultiplesUnder(TEN_LIMIT, MULT);
        assertEquals(SOLUTION_UNDER_TEN,multiples);
        assertEquals(SUM_SOLUTION_UNDER_TEN,multiples.stream().reduce(0, (a, b) -> a + b));
    }

    @DisplayName("Test MathUtils.findMultiplesUnder using 1000 as limit and 3 and 5 as multiples")
    @Test
    void testMultiplesUnderThousand() {
        List<Integer> multiples = MathUtils.findMultiplesUnder(THOUSAND_LIMIT, MULT);
        assertEquals(SUM_SOLUTION_UNDER_THOUSAND,multiples.stream().reduce(0, (a, b) -> a + b).longValue());

    }


}
