package es.vass.kata3;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MathUtils {

    public static List<Integer> findMultiplesUnder(Integer limit, Integer...multiples) {
        IntPredicate predicate = number -> Arrays.stream(multiples).anyMatch(multiple -> number%multiple == 0);
        return IntStream.range(1,limit).filter(predicate)
                .boxed().collect(Collectors.toList());
    }

    public static Long fibonacciEvenSumUnder(Long limit) {
        // TODO: pending implementing
        return null;
    }
}
