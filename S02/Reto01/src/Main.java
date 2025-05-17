import java.util.Scanner; //estamos importando la biblioteca Scanner

public class Main
{
    public static void main(String[] args)
    {
        //Inicializar el obj scanner
        Scanner S = new Scanner(System.in);
        //Declaración de variables
        String nombre;
        double Precio;
        int Cantidad;

        //Pedir datos del paciente
        System.out.println("Ingrese nombre del Medicamento: ");
        nombre = S.nextLine();
        System.out.println("Ingrese el precio: ");
        Precio = S.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        Cantidad = S.nextInt();

        // Cálculo del total
        double totalSinDescuento = Precio * Cantidad;

        // Evaluar si aplica descuento usando operador ternario
        var aplicaDescuento = totalSinDescuento > 500; // Al menos una implementacion de var
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        // Total a pagar
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar resumen
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + nombre);
        System.out.println("Cantidad: " + Cantidad);
        System.out.println("Precio unitario: $" + Precio);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

    }
}