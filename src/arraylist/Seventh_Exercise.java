package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Seventh_Exercise {
    //declaramos las variables a usar
    ArrayList<Integer> lista;
    Scanner scanner = new Scanner(System.in);

    public void insertar_Ordenado() {
        System.out.println("Exercise 7:");

        lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(i * 2);
        }

        System.out.println("Lista original:");
        System.out.println(lista);

        System.out.print("Ingrese numero a insertar: ");
        int num = scanner.nextInt();

        int pos = 0;
        while (pos < lista.size() && lista.get(pos) < num) {
            pos++;
        }
        lista.add(pos, num);

        System.out.println("Lista con insercion:");
        System.out.println(lista);

        System.out.print("Numero a borrar: ");
        int borrar = scanner.nextInt();
        lista.remove(Integer.valueOf(borrar));

        System.out.println("Lista final:");
        System.out.println(lista);
        System.out.println();
    }
}
