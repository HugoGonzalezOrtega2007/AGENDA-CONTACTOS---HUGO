import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listanombre = new String[100];
        int[] listanumero = new int [100];
        int indice = 0;

        boolean salir = false;
        while (!salir) {

            System.out.println("== Seleccione un menú ==");
            System.out.println("1 - Añadir contacto");
            System.out.println("2 - Mostrar contactos");
            System.out.println("3 - Modificar contacto");
            System.out.println("4 - Buscar contacto");
            System.out.println("5 - Salir");

            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion==1) {
                System.out.println("Has escogido añadir contacto");
                //NOMBRE
                System.out.print("Añade el nombre de tu contacto: ");
                String nombre = scanner.next();
                listanombre[indice] = nombre;
                //NUMERO
                System.out.print("Añade el numero de tu contacto: ");
                int numero = scanner.nextInt();
                listanumero[indice] = numero;
                indice++;
            }
            else if (opcion==2) {
                System.out.println("Has escogido mostrar contactos");
                for (int i = 0; i < listanombre.length; i++) {
                    if (listanombre[i] != null) {
                        System.out.println((i + 1) + " - " + listanombre[i] + " (" + listanumero[i] + ")");
                    }
                }
            }
            else if (opcion==3) {
                System.out.println("Has escogido modificar contacto");
                for (int i = 0; i < listanombre.length; i++) {
                    if (listanombre[i] != null) {
                        System.out.println((i + 1) + " - " + listanombre[i] + " (" + listanumero[i] + ")");
                    }
                }
                System.out.print("Que contacto quieres modificar? ");
                int modificar = scanner.nextInt();
                    System.out.println("Vale, modificando " + listanombre[modificar - 1]);
                    System.out.print("Añade el nuevo nombre de tu contacto: ");
                    String nuevoNombre = scanner.next();
                    listanombre[modificar - 1] = nuevoNombre;
                    System.out.print("Añade el nuevo numero de tu contacto: ");
                    int nuevoNumero = scanner.nextInt();
                    listanumero[modificar - 1] = nuevoNumero;
            }
            else if (opcion==4) {
                System.out.println("Has escogido buscar contactos");
            }
            else if (opcion==5) {
                System.out.println("Saliendo del programa...");
                salir = true;
            }
            else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
