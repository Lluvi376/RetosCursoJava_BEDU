//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("LGNMT0522251", 9000);

        CuentaFiscal cuenta = new CuentaFiscal("LGNMT0522251", 9000);

        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente()+ "por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean rfcVal = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?" + rfcVal);
    }
}