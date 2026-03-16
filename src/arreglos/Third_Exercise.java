package arreglos;

import java.util.Random;

public class Third_Exercise {
   //declaramos variables y usas la libreria ramdon para poder generera numeros aleatorios 
    Random random = new Random();
    //se declara la cantidad de numeros.
    private int n = 4;
    private int[] numeros;
    private long[] factoriales;
    
    public void factorial() {
        System.out.println("exercise 3");
        
        numeros = new int[n];
        factoriales = new long[n];
        
        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(4) + 1;
            
            long fact = 1;
            for (int j = 1; j <= numeros[i]; j++) {
                fact *= j;
            }
            factoriales[i] = fact;
        }
        
        System.out.println("\nNumero:");
        //Usamos un for each para recorrer mas facil el objeto.
        for (int x : numeros) {
            System.out.print(x + " ");
        }
        
        System.out.println("\nSu factorial Factorial:");
        for (long x : factoriales) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}