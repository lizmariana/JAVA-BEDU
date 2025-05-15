public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Juan Daniel");
        Patrulla patrulla = new Patrulla("Patrulla", "Ana");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Mary");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}