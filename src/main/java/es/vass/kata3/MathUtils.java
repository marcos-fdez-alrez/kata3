package es.vass.kata3;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.List;
import java.util.stream.Collectors;

public class MathUtils {

    public static Long findMultiplesUnder(Integer limit, Integer...multiples) {
        Predicate<Long> predicate = number -> Arrays.stream(multiples).anyMatch(multiple -> number%multiple == 0);
        return LongStream.range(1,limit).boxed()
                .filter(predicate).reduce(0L,(a, b) -> a + b);
    }

    public static Long fibonacciEvenSumUnder(Long limit) {
        return Stream.iterate(new long[]{0, 1}, n -> new long[]{n[1], n[0] + n[1]})
                .takeWhile( n -> n[0] <= limit)
                .mapToLong(n -> n[0])
                .filter(number -> number % 2 == 0)
                .reduce(0, (a,b) -> a + b);
    }
}
