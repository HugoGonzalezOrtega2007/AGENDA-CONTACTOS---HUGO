import java.util.Scanner;

public class l {
    public static void l(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String[]list = new String [100];

    for (int i = 0; i<5; i++) {
        list[i]=scanner.nextLine();
    }

    for (int i = 0; i< list.length; i++) {
        if (list[i] == null) {
            continue;
        } else {
            System.out.println(list[i]);
        }
    }
}}
