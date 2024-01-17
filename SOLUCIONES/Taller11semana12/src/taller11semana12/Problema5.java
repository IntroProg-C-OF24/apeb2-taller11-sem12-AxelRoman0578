package taller11semana12;
public class Problema5 {
    public static int sumarElementos(int[][] arregloBidimensional) {
        //Hecho por Axel Roman
        int suma = 0;
        for (int[] fila : arregloBidimensional) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }
    public static int restarElementos(int[][] arregloBidimensional) {
        int resta = 0;
        for (int[] fila : arregloBidimensional) {
            for (int elemento : fila) {
                resta -= elemento;
            }
        }
        return resta;
    }
    public static int multiplicarElementos(int[][] arregloBidimensional) {
        int producto = 1;
        for (int[] fila : arregloBidimensional) {
            for (int elemento : fila) {
                producto *= elemento;
            }
        }
        return producto;
    }
    public static void Ejecutable() {
        int[][] arregloBidimensional = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int resultadoSuma = sumarElementos(arregloBidimensional);
        int resultadoResta = restarElementos(arregloBidimensional);
        int resultadoMultiplicacion = multiplicarElementos(arregloBidimensional);
        System.out.println("La suma de los elementos es: " + resultadoSuma);
        System.out.println("La resta de los elementos es: " + resultadoResta);
        System.out.println("La multiplicación de los elementos es: " + resultadoMultiplicacion);
    }
    public static void main(String[] args) {
        Ejecutable();
    }
}