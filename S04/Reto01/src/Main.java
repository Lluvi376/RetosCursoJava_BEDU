//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Factura f1 = new Factura("F5CASA", "Arath Lopez", 5600.00);
        Factura f2 = new Factura("F6CASA", "Gerardo Garcia", 1450.00);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("¿Las Facturas son iguales?" + f1.equals(f2));
    }
}