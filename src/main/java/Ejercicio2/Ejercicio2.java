package Ejercicio2;

import java.util.function.IntConsumer;

public class Ejercicio2 {

    public static void mostrarFactoresPrimosIterativo(int num,int div) {
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num /= div;
            } else {
                div++;
            }
        }
        System.out.println(num);
    }

    public static void mostrarFactoresLambda(int num,int divisor) {
        IntConsumer funcion = valor -> {
            int div =divisor;
            while (valor > 1) {
                if (valor % div == 0) {
                    System.out.println(div);
                    valor /= div;
                } else {
                    div++;
                }
            }
        };
        funcion.accept(num);
    }



}
