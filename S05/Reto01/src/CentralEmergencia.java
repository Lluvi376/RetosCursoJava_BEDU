//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CentralEmergencia {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Alejandro");
        Patrulla patrulla = new Patrulla("Patrulla", "Leonel");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "María");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}