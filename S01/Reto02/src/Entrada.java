public class Entrada {
    //Atributos
    String Nombre;
    double Precio;

    //Constructor que inicializa el producto con nombre y precio
    public Entrada(String nombre, double precio) {
        this.Nombre = nombre;
        this.Precio = precio;
    }

    public void mostrarInformacion()
    {
        System.out.println("Evento:" + Nombre + " | Precio: " + Precio);
    }
}
