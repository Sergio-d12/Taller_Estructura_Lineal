package matrices;

public class Fourteenth_Exercise {
        //declaramos las variables a usar
    private int[][] matriz_original;
    private int[][] matriz_transpuesta;
    private int filas;
    private int columnas;
    
    public void calcular_Matriz_Transpuesta() {
        System.out.println("Exercise 14:");
        
        inicializarMatrizPredeterminada();
        calcularTranspuesta();
        
        imprimirMatriz("Matriz Original:", matriz_original, filas, columnas);
        imprimirMatriz("Matriz Transpuesta:", matriz_transpuesta, columnas, filas);
        System.out.println();
    }
    
    private void inicializarMatrizPredeterminada() {
        filas = 2;
        columnas = 3;
        
        matriz_original = new int[][] {
            {1, 2, 3},
            {4, 5, 6}
        };
    }
    
    private void calcularTranspuesta() {
        matriz_transpuesta = new int[columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz_transpuesta[j][i] = matriz_original[i][j];
            }
        }
    }
    
    private void imprimirMatriz(String titulo, int[][] matriz, int f, int c) {
        System.out.println(titulo);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}