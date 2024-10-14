import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1. Creamos el scanner.
        Scanner sc = new Scanner(System.in);

        // 2. Creamos las variables "Descuento".
        final int descuento1 = 25;
        final int descuento2 = 50;

        // 3. Declaramos las variables de importe.
        double importeInicial, importeDescuento, importeFinal;
        int numPiezas;

        // 4. Pregintamos al teclado el precio y las unidades.
        System.out.println("Cual es el precio? ");
        importeInicial = sc.nextDouble();
        System.out.println("Cuantas unidades compras? ");
        numPiezas = sc.nextInt();

        // 5. Creamos las operaciones.
        if (numPiezas <= 3){
            importeDescuento = importeInicial * (descuento1/100.0);
        }
        else {
            importeDescuento = importeInicial * (descuento2/100.0);
        }
        importeFinal = importeInicial - importeDescuento;
        System.out.println("El importe de la pieza es: " + importeFinal);
        }
    }
