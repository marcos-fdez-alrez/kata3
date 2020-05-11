import es.vass.kata3.MathUtils;

public class Launcher {

    public static void main(String...args) {
        System.out.println("La solución para los múltiplos de 3 y 5 hasta 10 es: "+ MathUtils.findMultiplesUnder(10, new Integer[]{3,5}));
    }

}
