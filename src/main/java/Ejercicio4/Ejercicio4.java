package Ejercicio4;

public class Ejercicio4 {
    public static boolean palindromoRecursivo(String palabra) {
        if (palabra.length() <= 1) {
            return true;
        } else if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        } else {
            String sub = palabra.substring(1, palabra.length() - 1);
            return palindromoRecursivo(sub);
        }
    }

    public static boolean palindromoIterativo(String palabra) {
        int i = 0, j = palabra.length() - 1;
        while (i < j) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
