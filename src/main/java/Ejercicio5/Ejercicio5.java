package Ejercicio5;

import java.util.function.IntBinaryOperator;

public class Ejercicio5 {
    //public static int maximoComunDivisorRecursivo(int valor1, int valor2) {
        //IntBinaryOperator gcd = (x, y) -> (y == 0) ? x : gcd.applyAsInt(y, x % y);
        //return gcd.applyAsInt(valor1, valor2);
   // }

    public static int maximoComunDivisorIterativo(int valor1, int valor2) {
        IntBinaryOperator gcd = (x, y) -> {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        };
        return gcd.applyAsInt(valor1, valor2);
    }
}
