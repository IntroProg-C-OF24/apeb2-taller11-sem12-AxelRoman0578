package taller11semana12;
import java.util.Scanner;
public class Problema3 {
    public static String obtenerPromedioCualitativo(double nota1, double nota2, double nota3, double nota4) {
        //Hecho por Axel Roman
        double sumaNotas = nota1 + nota2 + nota3 + nota4;
        double promedio = sumaNotas / 4;
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Error en el cálculo del promedio";
        }
    }
    public static void metodoPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Ingrese la cuarta nota: ");
        double nota4 = scanner.nextDouble();
        String resultado = obtenerPromedioCualitativo(nota1, nota2, nota3, nota4);
        System.out.println("El promedio cualitativo es: " + resultado);
    }
    public static void main(String[] args) {
        metodoPrincipal();
    }
}