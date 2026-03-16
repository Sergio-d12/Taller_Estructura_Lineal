package matrices;

import java.util.Random;
import java.util.Scanner;

public class Fifteenth_Exercise {
        //declaramos las variables a usar
     Random random = new Random();
     Scanner scanner = new Scanner(System.in);
    private int[][] matriz;
    private int filas;
    private int columnas;
    
    public void intercambiar_Primeras_DosFilas() {
        System.out.println("Exercise 15:");
        
        leerDimensiones();
        generarMatrizAleatoria();
        
        System.out.println("Matriz original:");
        imprimirMatriz();
        
        intercambiarFila0ConFila1();
        
        System.out.println("Matriz despues del intercambio:");
        imprimirMatriz();
        System.out.println();
    }
    
    private void leerDimensiones() {
        System.out.print("Numero de filas: ");
        filas = scanner.nextInt();
        
        System.out.print("Numero de columnas: ");
        columnas = scanner.nextInt();
    }
    
    private void generarMatrizAleatoria() {
        matriz = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }
    }
    
    private void intercambiarFila0ConFila1() {
        if (filas < 2) {
            System.out.println("No hay suficientes filas para intercambiar");
            return;
        }
        
        for (int j = 0; j < columnas; j++) {
            int auxiliar = matriz[0][j];
            matriz[0][j] = matriz[1][j];
            matriz[1][j] = auxiliar;
        }
    }
    
    private void imprimirMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}