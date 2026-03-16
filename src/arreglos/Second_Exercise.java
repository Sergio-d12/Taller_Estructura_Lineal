package arreglos;

public class Second_Exercise {
    //declaro las variables a usar 
    private int[] Pares;
    private int numeroLinea = 1;
    
    public void pares() {
        System.out.println("Exercise 2:");
        Pares = new int[100];
        //Uso la funcion lengt para recorre todo lo que este en el for
        for (int i = 0; i < Pares.length; i++) {
            Pares[i] = i * 2;
        }
        
        System.out.print("En una sola linea ");
        for (int par : Pares) {
            System.out.print(par + " ");
        }
        System.out.println();
        
        System.out.println("En 10 lineas:");
        numeroLinea = 1;
        for (int i = 0; i < Pares.length; i++) {
            if (i % 10 == 0) {
           //el numero de linea va en aumento
                System.out.print("Linea " + numeroLinea + ": ");
                numeroLinea++;
            }
            System.out.print(Pares[i] + " ");
            if ((i + 1) % 10 == 0) {
                //se hace para separar el codigo
                System.out.println();
            }
        }
    }
}