package matrices;

import java.util.Random;
import java.util.Scanner;

public class Eleventh_Exercise {
    //declaramos las variables a usar
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private int[][] matriz;
    private int filas;
    private int columnas;

    public void buscar_Numero_En_Matriz() {
        System.out.println("Exercise 11:");

        generarMatrizAleatoria();
        imprimirMatriz("Matriz generada:");

        System.out.print("Numero a buscar: ");
        int numero_buscado = scanner.nextInt();

        buscarYMostrarPosicion(numero_buscado);
        System.out.println();
    }

    private void generarMatrizAleatoria() {
        filas = 4;
        columnas = 5;
        matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }
    }

    private void imprimirMatriz(String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void buscarYMostrarPosicion(int numero) {
        boolean encontrado = false;

        for (int i = 0; i < filas && !encontrado; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Encontrado en posicion [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El numero NO se encuentra");
        }
    }
}
