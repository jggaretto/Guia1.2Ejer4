
package ejer4;


public class Ejer4 {

    
    public static void main(String[] args) {
      
      // Convertir 500 dólares a pesos y mostrar por consola lo convertido.
        double dolares = 500;
        double pesos = Conversor.convertirAPesos(dolares);
        System.out.println(dolares + " dólares equivalen a " + pesos + " pesos argentinos.");

        // Convertir 25700 pesos a dólares y mostrar por consola lo convertido
        pesos = 25700;
        dolares = Conversor.convertirADolar(pesos);
        System.out.println(pesos + " pesos argentinos equivalen a " + dolares + " dólares.");
    }
    
}
