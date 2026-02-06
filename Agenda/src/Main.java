import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        String[] listaNombre = new String[100];
        int[] listaNumero = new int[100];
        int indice = 0;
        int opcion = 0;
        String nombre = "";
        int numero = 0;
        int modificar = 0;
        String nuevoNombre = "";
        int nuevoNumero = 0;

        print(salir, listaNombre, listaNumero, indice, opcion, nombre, numero, modificar, nuevoNombre, nuevoNumero);
    }
    public static void añadirContacto (String[] listaNombre, int[] listaNumero, int indice, String nombre, int numero) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Has escogido añadir contacto.");

        //NOMBRE
        System.out.print("Añade el nombre de tu contacto: ");
        nombre = scanner.next();
        listaNombre[indice] = nombre;

        //NUMERO
        System.out.print("Añade el numero de tu contacto: ");
        numero = scanner.nextInt();
        listaNumero[indice] = numero;
        indice++;

        System.out.println("");
    }
    public static void mostrarContactos (String[] listaNombre, int[] listaNumero) {
        System.out.println("Has escogido mostrar contactos.");
        for (int i = 0; i < listaNombre.length; i++) {
            if (listaNombre[i] != null) {
                System.out.println((i + 1) + " - " + listaNombre[i] + " (" + listaNumero[i] + ")");
            }
        }
        System.out.println("");
    }
    public static void modificarContacto (String[] listaNombre, int[] listaNumero, int indice, String nombre, int numero, int modificar, String nuevoNombre, int nuevoNumero) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Has escogido modificar contacto.");
        for (int i = 0; i < listaNombre.length; i++) {
            if (listaNombre[i] != null) {
                System.out.println((i + 1) + " - " + listaNombre[i] + " (" + listaNumero[i] + ")");
            }
        }

        System.out.print("Que contacto quieres modificar? ");
        modificar = scanner.nextInt();
        System.out.println("Vale, modificando " + listaNombre[modificar - 1] + ".");

        System.out.print("Añade el nuevo nombre de tu contacto: ");
        nuevoNombre = scanner.next();
        listaNombre[modificar - 1] = nuevoNombre;

        System.out.print("Añade el nuevo numero de tu contacto: ");
        nuevoNumero = scanner.nextInt();
        listaNumero[modificar - 1] = nuevoNumero;
        System.out.println("");
    }
    public static void salir (boolean salir, int opcion) {
        System.out.println("Saliendo del programa...");
    }

    static void print (boolean salir, String[] listaNombre, int [] listaNumero, int indice, int opcion, String nombre, int numero, int modificar, String nuevoNombre, int nuevoNumero) {
        salir = false;
        while (!salir) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("== MENÚ ==");
            System.out.println("1 - Añadir contacto | 2 - Mostrar contactos | 3 - Modificar contacto | 4 - Salir");
            System.out.print("Introduzca el número de la opción a la que quiere acceder: ");
            opcion = scanner.nextInt();
            System.out.println("");

            if (opcion==1) {
                añadirContacto(listaNombre, listaNumero, indice, nombre, numero);
            }

            else if (opcion==2) {
                mostrarContactos(listaNombre, listaNumero);
            }

            else if (opcion==3) {
                modificarContacto(listaNombre, listaNumero, indice, nombre, numero, modificar, nuevoNombre, nuevoNumero);
            }

            else if (opcion==4) {
                salir(salir, opcion);
                salir = true;
            }
        }
    }
}