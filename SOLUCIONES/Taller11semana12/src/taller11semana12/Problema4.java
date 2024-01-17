package taller11semana12;
import java.util.Scanner;
public class Problema4 {
    public static void calcularValorLuz(String nombreCliente, String cedulaCliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del kilowatio: ");
        double valorKilowatio = scanner.nextDouble();
        System.out.print("Ingrese el número de kilowatios del mes: ");
        double numKilowatios = scanner.nextDouble();
        double valorPlanilla = valorKilowatio * numKilowatios;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente + " debe cancelar el valor de $" + valorPlanilla);
    }
    public static void calcularPredio(String nombreCliente, String cedulaCliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del inmueble: ");
        double valorInmueble = scanner.nextDouble();
        double valorPredio = valorInmueble * 0.02;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente +
                           " tiene un bien inmueble valorado en $" + valorInmueble + " y tiene que pagar de predio $" + valorPredio);
    }
    public static void metodoPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la opción:");
        System.out.println("1. Calcular Valor de Planilla de Luz");
        System.out.println("2. Calcular Valor del Predio");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del cliente: ");
                String nombreClienteLuz = scanner.next();
                System.out.print("Ingrese la cédula del cliente: ");
                String cedulaClienteLuz = scanner.next();
                calcularValorLuz(nombreClienteLuz, cedulaClienteLuz);
                break;
            case 2:
                System.out.print("Ingrese el nombre del cliente: ");
                String nombreClientePredio = scanner.next();
                System.out.print("Ingrese la cédula del cliente: ");
                String cedulaClientePredio = scanner.next();
                calcularPredio(nombreClientePredio, cedulaClientePredio);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
    public static void main(String[] args) {
        metodoPrincipal();
    }
}