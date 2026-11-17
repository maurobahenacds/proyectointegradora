import java.util.Scanner;

public class TiendaCuadernos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del cuaderno: ");
        double precioUnitario = scanner.nextDouble();
        
        System.out.print("Ingrese el total de cuadernos: ");
        int cantidad = scanner.nextInt();
        
        double totalCompra = precioUnitario * cantidad;
        double descuento = 0.0;
        
        // Aplica un cupón del 5% de descuento solo a las compras mayores a 1000 pesos
        if (totalCompra > 1000.0) {
            descuento = totalCompra * 0.05;
        }
        
        double subtotal = totalCompra - descuento;
        double iva = subtotal * 0.16; // IVA del 16%
        double totalPagar = subtotal + iva;
        
        System.out.printf("Total de la compra: $%,.2f\n", totalCompra);
        System.out.printf("Descuento 5%: - $%,.2f\n", descuento);
        System.out.printf("Subtotal: $%,.2f\n", subtotal);
        System.out.printf("IVA: $%,.2f\n", iva);
        System.out.printf("Total a pagar: $%,.2f\n", totalPagar);
        
        scanner.close();
    }
}