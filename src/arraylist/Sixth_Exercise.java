package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Sixth_Exercise {
        //declaramos las variables a usar
    private Random random = new Random();
    private ArrayList<Integer> lista;
    private int suma;
    private double media;
    
    public void leer_Hasta10() {
        System.out.println("Exercise 6:");
        
        lista = new ArrayList<>();
        int numero;
        int intentos = 0;
        int maxIntentos = 1000;
        
        do {
            numero = random.nextInt(21) - 10;
            lista.add(numero);
            intentos++;
        } while (numero != 10 && intentos < maxIntentos);
        
        suma = 0;
        for (int x : lista) {
            suma += x;
        }
        media = (double) suma / lista.size();
        
        System.out.println("Numeros leidos:");
        for (int x : lista) {
            System.out.print(x + " ");
        }
        System.out.println("\nSuma: " + suma);
        System.out.println("Media: " + media);
        System.out.println();
    }
}