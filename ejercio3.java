import java.util.Scanner;

public class PedirContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasena = "";
        
        // Ciclo para solicitar la contraseña mientras no sea ninguna de las dos válidas
        while (!contrasena.equals("Admin123") && !contrasena.equals("P4as5Fac3")) {
            System.out.print("Ingresa la contrasena: ");
            contrasena = scanner.nextLine();
        }
        
        // Validación de bienvenida según la contraseña ingresada
        if (contrasena.equals("Admin123")) {
            System.out.println("Bienvenido Admin");
        } else {
            System.out.println("Bienvenido a Facebook!");
        }
        
        scanner.close();
    }
}