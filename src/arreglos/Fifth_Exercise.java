package arreglos;

import java.util.Random;

public class Fifth_Exercise {
    //declaramos las variables a usar
    private int[] numeros;
    private int[] invertidos;
    Random random = new Random();

    public void numeros_Invertidos() {
        System.out.println("Exercise 5:");

        numeros = new int[20];
        invertidos = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(900) + 100;

            int num = numeros[i];
            int inv = 0;

            while (num > 0) {
                inv = inv * 10 + num % 10;
                num /= 10;
            }
            invertidos[i] = inv;
        }

        System.out.print("Originales: ");
        for (int x : numeros) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Invertidos: ");
        for (int x : invertidos) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
