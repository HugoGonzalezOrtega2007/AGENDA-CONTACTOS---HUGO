import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("- Añadir contacto");
        System.out.println("- Mostrar contactos");
        System.out.println("- Buscar contacto");
        System.out.println("- Salir");

        System.out.print("Escriba la opcion que quiere seleccionar: ");

        String option = scanner.nextLine();
        System.out.println("Has escogido: " + option);

        scanner.close();
    }
}
