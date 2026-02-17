import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Contacto[] listaContactos = new Contacto[100];
        int indice = 0;

        print(listaContactos, indice);
    }
    public static void print (Contacto[] listaContactos, int indice) {
        boolean salir = false;
        while (!salir) {

            System.out.println("==== MENÚ ====");
            System.out.println("1 - Añadir contacto | 2 - Mostrar contactos | 3 - Modificar contacto | 4 - Salir");
            System.out.print("Introduzca el número de la opción a la que quiere acceder: ");
            int opcion = scanner.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    indice = añadirContacto(listaContactos, indice);
                    break;
                case 2:
                    mostrarContactos(listaContactos);
                    break;
                case 3:
                    modificarContacto(listaContactos);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
            }
        }
    }
    public static int añadirContacto(Contacto[] listaContactos, int indice) {
        System.out.print("Añade el nombre del contacto: ");
        String nombre = scanner.next();

        System.out.print("Añade el número del contacto: ");
        int numero = scanner.nextInt();

        listaContactos[indice] = new Contacto(nombre, numero);

        System.out.println("Contacto añadido correctamente.\n");

        return indice + 1;
    }
    public static void mostrarContactos(Contacto[] listaContactos) {
        System.out.println("Lista de contactos:");
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] != null) {
                System.out.println((i + 1) + " - " + listaContactos[i]);
            }
        }
        System.out.println();
    }
    public static void modificarContacto(Contacto[] listaContactos) {
        mostrarContactos(listaContactos);

        System.out.print("¿Qué contacto quieres modificar? ");
        int posicion = scanner.nextInt() - 1;

        if (posicion >= 0 && posicion < listaContactos.length && listaContactos[posicion] != null) {
            System.out.print("Añade el nuevo nombre del contacto: ");
            String nuevoNombre = scanner.next();
            listaContactos[posicion].setNombre(nuevoNombre);

            System.out.print("Añade el nuevo número del contacto: ");
            int nuevoNumero = scanner.nextInt();
            listaContactos[posicion].setNumero(nuevoNumero);

            System.out.println("Contacto modificado correctamente.\n");

        } else {
            System.out.println("No tienes ese número de contacto.\n");
        }
    }
}