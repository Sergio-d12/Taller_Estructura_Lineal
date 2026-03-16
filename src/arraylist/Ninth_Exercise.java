package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ninth_Exercise {
    //declaramos las variables a usar

    Random random = new Random();
    ArrayList<Integer> lista;

    public void ordenar_Separar() {
        System.out.println("Exercise 9:");

        lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(100) + 1);
        }

        System.out.println("Lista original:");
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println("Ordenada menor a mayor:");
        System.out.println(lista);

        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Ordenada mayor a menor:");
        System.out.println(lista);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int x : lista) {
            if (x % 2 == 0) {
                pares.add(x);
            } else {
                impares.add(x);
            }
        }

        System.out.println("Pares:");
        System.out.println(pares);

        System.out.println("Impares:");
        System.out.println(impares);
        System.out.println();
    }
}
