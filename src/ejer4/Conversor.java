/*
 En un nuevo proyecto, crear una clase de nombre Conversor con los siguientes métodos
estáticos:
 convertirAPesos(): recibe un valor en dólares y retorna convertido a pesos argentinos.
 convertirADolar(): recibe un valor en pesos argentinos y retorna convertido a dólar.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Conversor.
a) Convertir 500 dólares a pesos y mostrar por consola lo convertido.
b) Convertir 25700 pesos a dólares y mostrar por consola lo convertido
 */
package ejer4;


public class Conversor {
     private static final double TIPO_CAMBIO = 98.40; // Tipo de cambio actual USD/ARS

    public static double convertirAPesos(double dolares) {
        return dolares * TIPO_CAMBIO;
    }

    public static double convertirADolar(double pesos) {
        return pesos / TIPO_CAMBIO;
    }
}
