package matrices;

import java.util.Random;

public class Thirteenth_Exercise {
    //declaramos las variables a usar
    Random random = new Random();
    private int[][] matriz;
    private int tamaño;

    public void verificar_Matriz_Simetrica() {
        System.out.println("Exercise 13:");

        generarMatrizAleatoria();
        imprimirMatriz();

        boolean es_simetrica = comprobarSimetria();
        System.out.println("Es simetrica: " + es_simetrica);

        imprimirEsquinas();
        System.out.println();
    }

    private void generarMatrizAleatoria() {
        tamaño = 4;
        matriz = new int[tamaño][tamaño];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = random.nextInt(20);
            }
        }
    }

    private void imprimirMatriz() {
        System.out.println("Matriz:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean comprobarSimetria() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void imprimirEsquinas() {
        System.out.println("Esquinas:");
        System.out.println(
                matriz[0][0] + " "
                + matriz[0][tamaño - 1] + " "
                + matriz[tamaño - 1][0] + " "
                + matriz[tamaño - 1][tamaño - 1]
        );
    }
}
