package arreglos;

import java.util.Random;

public class Fourth_Exercise {
    //declaramos variables
    private int[] datos;
    private int menor;
    private int mayor;
    Random random = new Random();

    public void numeros_menor_Mayor() {
        datos = new int[25];
        menor = 999;
        mayor = -999;
        // hacemos un for para recorrer los numeros aleatorios 
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(101) - 50;

            if (datos[i] < menor) {
                menor = datos[i];
                
            } else if (datos[i] > mayor) {
                mayor = datos[i];
            }
        }

        System.out.println("Exercise 4");
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        System.out.println();
    }
}
