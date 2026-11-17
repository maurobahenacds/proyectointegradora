import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalProductos = 10;
        int economicos = 0;
        int costosos = 0;
        double sumaPrecios = 0;
        double precioMasAlto = Double.MIN_VALUE;
        double precioMasBajo = Double.MAX_VALUE;
        
        System.out.println("=== REGISTRO DE PRODUCTOS DE UNA TIENDA ===");
        
        // Utilizar un ciclo for para solicitar los precios de los 10 productos
        for (int i = 1; i <= totalProductos; i++) {
            double precio = 0;
            
            // Validar con do-while que cada precio ingresado sea mayor que cero
            do {
                System.out.print("Ingrese el precio del producto " + i + ": ");
                precio = scanner.nextDouble();
                if (precio <= 0) {
                    System.out.println("Error: El precio debe ser mayor a cero. Intente de nuevo.");
                }
            } while (precio <= 0);
            
            sumaPrecios += precio;
            
            // Determinar si cada producto es económico o costoso (<= 100 o > 100)[cite: 1]
            if (precio <= 100) {
                economicos++;
            } else {
                costosos++;
            }
            
            // Evaluar precio más alto y más bajo
            if (precio > precioMasAlto) {
                precioMasAlto = precio;
            }
            if (precio < precioMasBajo) {
                precioMasBajo = precio;
            }
        }
        
        double promedio = sumaPrecios / totalProductos;
        
        // Mostrar reporte final[cite: 1]
        System.out.println("\n===== REPORTE FINAL =====");
        System.out.println("Cantidad de productos registrados: " + totalProductos);
        System.out.println("Productos económicos (menor o igual a $100): " + economicos);
        System.out.println("Productos costosos (mayor a $100): " + costosos);
        System.out.printf("Promedio de precios: $%,.2f\n", promedio);
        System.out.printf("Precio más alto: $%,.2f\n", precioMasAlto);
        System.out.printf("Precio más bajo: $%,.2f\n", precioMasBajo);
        
        scanner.close();
    }
}