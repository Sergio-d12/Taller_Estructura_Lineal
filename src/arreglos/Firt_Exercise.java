package arreglos;

public class Firt_Exercise {
    //declaramos las variables a usar
    private int[] numeros_Primos;
    
    public void Primos() {
        System.out.println("Exercise 1:");
        numeros_Primos = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        
        for (int i = 0; i < numeros_Primos.length; i++) {
            System.out.print(numeros_Primos[i] + " ");
        }
        System.out.println();
    }
}
