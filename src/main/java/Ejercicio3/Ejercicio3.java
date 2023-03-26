package Ejercicio3;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Ejercicio3 {

    public static String decimalToHex(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        IntUnaryOperator toHex = n -> {
            int rem = n % 16;
            while (n > 0) {
                if (rem < 10) {
                    hex.append((char) ('0' + rem));
                } else {
                    hex.append((char) ('A' + rem - 10));
                }
                n /= 16;
                rem = n % 16;
            }
            return n;
        };
        toHex.applyAsInt(decimal);
        return hex.reverse().toString();
    }
}

// si llegas hasta aqui esto lo ha hecho el chatgpt no entiendo un pijo
