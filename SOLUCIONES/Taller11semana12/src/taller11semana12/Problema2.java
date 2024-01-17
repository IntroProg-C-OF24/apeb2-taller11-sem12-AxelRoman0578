package taller11semana12;
import java.util.Scanner;
public class Problema2 {
    public static void obtenerAreaCuadrado() {
        //Hecho por Axel Roman
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double areaCuadrado = lado * lado;
        System.out.println("El área del cuadrado es: " + areaCuadrado);
    }
    public static void obtenerAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double alturaTriangulo = scanner.nextDouble();
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("El área del triángulo es: " + areaTriangulo);
    }
    public static void obtenerAreaRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        double areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("El área del rectángulo es: " + areaRectangulo);
    }
    public static void metodoPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la figura para calcular el área:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
    public static void main(String[] args) {
        metodoPrincipal();
    }
}