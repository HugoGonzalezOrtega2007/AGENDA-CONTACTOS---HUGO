import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un menú: ");

        System.out.println("- Añadir contacto");
        System.out.println("- Mostrar contactos");
        System.out.println("- Buscar contacto");
        System.out.println("- Salir");

        String opcion = scanner.nextLine();
        if (opcion.equals("Añadir contacto")) {
            System.out.println("Has escogido: " + opcion);
        } else if (opcion.equals("Mostrar contactos")) {
            System.out.println("Has escogido: " + opcion);
        } else if (opcion.equals("Buscar contacto")) {
            System.out.println("Has escogido: " + opcion);
        } else {
            System.out.println("Has escogido: " + opcion);
        }

        scanner.close();
    }
}
