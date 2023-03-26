package Ejercicio3;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Ejercicio3 {

    public static String cambiarBase(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        IntUnaryOperator pasarAHexadecimal = valor -> {
            int rem = valor % 16;
            while (valor > 0) {
                if (rem < 10) {
                    hex.append((char) ('0' + rem));
                } else {
                    hex.append((char) ('A' + rem - 10));
                }
                valor /= 16;
                rem = valor % 16;
            }
            return valor;
        };
        pasarAHexadecimal.applyAsInt(decimal);
        return hex.reverse().toString();
    }
}

// si llegas hasta aqui esto lo ha hecho el chatgpt no entiendo un pijo
