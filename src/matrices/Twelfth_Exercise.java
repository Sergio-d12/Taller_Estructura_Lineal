package matrices;

import java.util.Random;

public class Twelfth_Exercise {
    //declaramos las variables a usar
    Random random = new Random();
    private int[][] matriz;
    private int tamaño;

    public void sumar_Diagonal_Opuesta() {
        System.out.println("Exercise 12:");

        generarMatrizCuadrada();
        imprimirMatrizConSuma();
        System.out.println();
    }

    private void generarMatrizCuadrada() {
        tamaño = 4;
        matriz = new int[tamaño][tamaño];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = random.nextInt(101) - 50;
            }
        }
    }

    private void imprimirMatrizConSuma() {
        int suma_diagonal = 0;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");

                if (i + j == tamaño - 1) {
                    suma_diagonal += matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Suma diagonal opuesta: " + suma_diagonal);
    }
}
