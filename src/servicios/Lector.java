package servicios;

import java.util.Scanner;

public class Lector {
    private static final Scanner s = new Scanner(System.in);
    private Lector() {}
    public static Scanner leer() {
        return s;
    }
}
