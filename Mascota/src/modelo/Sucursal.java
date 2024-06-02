package modelo;
import java.util.Scanner;
/*Crear el enum Sucursal, donde se pueda establecer el nombre de la sucursal y manejar
diferentes zonas
Equipo:
-Sosa Santiago Nadya Cristina

*/

enum Sucursal {

    CENTRO("Sucursal 1, del centro"),
    SUR("Sucursal 2, del sur"),
    NORTE("Sucursal 3, del norte"),
    ESTE("Sucursal 4, del este"),
    OESTE("Sucursal 5, del oeste");

    private final String nombre;

    private Sucursal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class EleccionSuc {

    private Sucursal sucursal;
    private int numero;

    public EleccionSuc(Sucursal sucursal, int numero) {
        this.sucursal = sucursal;
        this.numero = numero;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public int getNumero() {
        return numero;
    }
}

public class Sucursal{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la sucursal (CENTRO, SUR, NORTE, ESTE, OESTE): ");
        String input = scanner.nextLine().toUpperCase();

        try {

            Sucursal sucursalElegida = Sucursal.valueOf(input);
            EleccionSuc eleccion = new EleccionSuc(sucursalElegida, sucursalElegida.ordinal() + 1);

            System.out.println("Sucursal elegida: " + eleccion.getSucursal().getNombre());
            System.out.println("Número de la sucursal: " + eleccion.getNumero());

        } catch (IllegalArgumentException e) {

            System.out.println("Sucursal no válida, ingresa una opcion valida.");

        } finally {

            scanner.close();
        }
    }
}
