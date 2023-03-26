# EntregaTP_UnaMasPorfavor
## Nota: 
Mi repositorio es: https://github.com/RRG1312/EntregaTP_EjercicioPruebas.git

## Enunciado:
## 1. Dado el siguiente fragmento de código C:
  static final double N = 2; 
static final double PREC = 1e-6;
static double f (double x)
{
return x*x-N;
}
static double bisect (double min, double max)
{
double med = (min+max)/2;
if (max-min<PREC) { 
return med;
} else if (f(min)*f(med)<0) { 
return bisect (min,med);
} else {
return bisect (med,max);
}
}
  
a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el 
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?
b) Implemente un algoritmo iterativo equivalente
