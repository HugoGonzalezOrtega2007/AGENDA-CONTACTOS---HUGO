import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {

            System.out.println("\n Seleccione un menú:");

            System.out.println("- Añadir contacto");
            System.out.println("- Mostrar contactos");
            System.out.println("- Buscar contacto");
            System.out.println("- Salir");

            System.out.print("Opción: ");

            String opcion = scanner.nextLine();

            if (opcion.equals("Añadir contacto")) {
                System.out.println("Has escogido: " + opcion);
            }
            else if (opcion.equals("Mostrar contactos")) {
                System.out.println("Has escogido: " + opcion);
            }
            else if (opcion.equals("Buscar contacto")) {
                System.out.println("Has escogido: " + opcion);
            }
            else if (opcion.equals("Salir")) {
                System.out.println("Saliendo del programa...");
                salir = true;
            }
            else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
