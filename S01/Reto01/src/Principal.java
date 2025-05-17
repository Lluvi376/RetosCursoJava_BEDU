import java.util.Scanner; //estamos importando la biblioteca Scanner

public class Principal
{
    public static void main(String[] args)
    {
        //Inicializar el obj scanner
        Scanner S = new Scanner(System.in);
        //Declaración de variables
        String nombre;
        String expediente;
        int edad;

        //Pedir datos del paciente
        System.out.println("Ingrese nombre del paciente: ");
        nombre = S.nextLine();
        System.out.println("Ingrese edad del paciente: ");
        edad = S.nextInt();
        System.out.println("Ingrese expediente del paciente: ");
        expediente = S.next();

        //Crear obj de tipo producto utilizando el constructor
        Paciente paciente = new Paciente(nombre, edad, expediente);

        paciente.mostrarInfo();
    }
}