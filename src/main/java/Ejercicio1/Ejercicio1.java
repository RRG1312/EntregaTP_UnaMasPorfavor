package Ejercicio1;

public class Ejercicio1 {
    static double N =2;
    static double PREC = 0.000001;

    public static double f (double x)
    {
        return x*x-N;
    }
    public static double bisection(double min, double max) {
        N = max;
        double med =-1;
        while (max-min>PREC) {
            med = (min + max) / 2.0;

            if (f(min)*f(med)<0) {
                max = med;
            } else {
                min = med;
            }
            med = (min + max) / 2.0;
        }
        return med;
    }
}
