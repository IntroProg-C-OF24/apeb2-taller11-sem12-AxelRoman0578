package taller11semana12;
public class Problema1 {
    public static void imprimirValoresPares(int[][] arregloBidimensional) {
        //Hecho por Axel Roman
        for (int[] fila : arregloBidimensional) {
            for (int elemento : fila) {
                if (elemento % 2 == 0) {
                    System.out.print(elemento + " ");
                }
            }
        }
        System.out.println();
    }
    public static void imprimirValoresImpares(int[][] arregloBidimensional) {
        for (int[] fila : arregloBidimensional) {
            for (int elemento : fila) {
                if (elemento % 2 != 0) {
                    System.out.print(elemento + " ");
                }
            }
        }
        System.out.println();
    }
    public static double calcularPromedio(int[][] arregloBidimensional) {
        int totalElementos = 0;
        int sumaElementos = 0;
        for (int[] fila : arregloBidimensional) {
            for (int elemento : fila) {
                sumaElementos += elemento;
                totalElementos++;
            }
        }
        return (double) sumaElementos / totalElementos;
    }
    public static void metodoPrincipal() {
        int[][] arregloBidimensional = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Valores Pares:");
        imprimirValoresPares(arregloBidimensional);
        System.out.println("Valores Impares:");
        imprimirValoresImpares(arregloBidimensional);
        double promedio = calcularPromedio(arregloBidimensional);
        System.out.println("Promedio: " + promedio);
    }
    public static void main(String[] args) {
        metodoPrincipal();
    }
}