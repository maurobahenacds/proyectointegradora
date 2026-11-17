import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int pares = 0;
        int impares = 0;
        
        System.out.print("Ingresa un numero (0 para terminar): ");
        numero = scanner.nextInt();
        
        // Ciclo que se ejecuta mientras el número sea diferente de cero
        while (numero != 0) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            System.out.print("Ingresa otro numero (0 para terminar): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
        
        scanner.close();
    }
}