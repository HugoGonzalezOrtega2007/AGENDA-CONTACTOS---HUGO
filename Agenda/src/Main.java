import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listanombre = new String[100];
        int[] listanumero = new int [100];
        int indice = 0;

        boolean salir = false;
        while (!salir) {

            System.out.println("\nSeleccione un menú:");
            System.out.println("- Añadir contacto");
            System.out.println("- Mostrar contactos");
            System.out.println("- Buscar contacto");
            System.out.println("- Salir");

            System.out.print("Opción: ");
            String opcion = scanner.nextLine();

            if (opcion.equals("Añadir contacto")) {
                System.out.println("Has escogido añadir contacto");
                System.out.println("Añade el nombre de tu contacto: ");
                String nombre = scanner.nextLine();
                listanombre[indice] = nombre;
                indice++;
                System.out.println("Añade el numero de tu contacto: ");
                int numero = scanner.nextInt();
                listanumero[indice] = numero;
                indice++;
            }
            else if (opcion.equals("Mostrar contactos")) {
                System.out.println("Has escogido mostrar contactos");
                for (int i = 0; i < listanombre.length; i++) {
                    if (listanombre[i] != null) {
                        System.out.println((i + 1) + "- " + listanombre[i] + " (" + listanumero[i] + ")");
                    }
                }
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
    }
}
