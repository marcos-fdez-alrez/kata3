import es.vass.kata3.MathUtils;

public class Launcher {

    public static void main(String...args) {
        System.out.println("La solución para la suma de los múltiplos de 3 y 5 hasta 10 es: "+ MathUtils.findMultiplesUnder(10, new Integer[]{3,5}));
        System.out.println("La solución para los elementos pares de fibonacci por debajo de 4 millones es: "+ MathUtils.fibonacciEvenSumUnder(4_000_000L));
    }

}
