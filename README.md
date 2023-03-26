# EntregaTP_UnaMasPorfavor
## Nota: 
Mi repositorio es: https://github.com/RRG1312/EntregaTP_EjercicioPruebas.git

## Enunciado:
## 1. Dado el siguiente fragmento de código C:

a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el 
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?

Esta funcion calcula la raiz de una funcion f(x) mediante una funcion bisect que corresponde a la biseccion de de dicha f(x) en un intervalo de 0 a N.
La N regula el rango en el que se calcula la raiz de la funcion por lo que se si varia este valor se modifica el rango en el que se busca la raiz de la funcion y si cambiamos f(x) entonces calcularemos la raiz de una nueva funcion en el rango mencionado anteriormente.

b) Implemente un algoritmo iterativo equivalente
  Ejercicio 1 del proyecto java


## 2. Dado el siguiente algoritmo recursivo:
a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función 
recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?

Esta funcion recursiva esta descmponiendo en factores el numero de entrada de la funcion 'num' y lo divide entre el segundo parametro de entrada
'div', en caso de de ser divisible num entre div se muestra div por pantalla, en caso contrario se aumento en 1 div y se llama de manera recursiva a f pero con el numero dividido y el el valor de div aumentado.

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda 
equivalentes:
Realizado en proyecto java


## 3. Construya una función que convierta un número decimal en una cadena que represente el 
valor del número en hexadecimal (base 16). A continuación, generalice la función para 
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante expresiones lambda.
Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16 
en las cuales los restos determinan los dígitos hexadecimales del número según 
la siguiente correspondencia.

Realizado en proyecto java


## 4. Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga 
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo, 
“DABALEARROZALAZORRAELABAD” es un palíndromo.


## 5. Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda, 
una función que nos devuelva el máximo común divisor de dos números enteros 
utilizando el algoritmo de Euclides.
ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n, 
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).


