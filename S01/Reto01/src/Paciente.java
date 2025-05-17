public class Paciente {

    //Atributos
    String nombre;
    int edad;
    String expediente;

    public Paciente(String nombre, int edad, String expediente)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.expediente = expediente;
    }

    //Método que muestra info del paciente
    public void mostrarInfo(){
        System.out.println("****************************************************************");
        System.out.println("Nombre del paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}
