package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Eighth_Exercise {
    //declaramos las variables a usar
    Random random = new Random();
    ArrayList<Integer> lista;

    public void frecuencias() {
        System.out.println("Exercise 8:");

        lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add(random.nextInt(20) + 1);
        }

        int mayorFrecuencia = 0;
        int numeroMasRepite = 0;

        System.out.println("Numero - Frecuencia");

        for (int i = 1; i <= 20; i++) {
            int contador = 0;
            for (int x : lista) {
                if (x == i) {
                    contador++;
                }
            }
            System.out.println(i + " - " + contador);

            if (contador > mayorFrecuencia) {
                mayorFrecuencia = contador;
                numeroMasRepite = i;
            }
        }

        System.out.println("Numero que mas se repite: " + numeroMasRepite);
        System.out.println();
    }
}
