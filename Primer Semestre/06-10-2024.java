// EJERCICIO 13
import java.util.ArrayList;
public class Habitante {
    private String nombre, apellido1, apellido2; // Atributos del habitante
    // Constructor para inicializar los atributos
    public Habitante(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre; this.apellido1 = apellido1; this.apellido2 = apellido2;
    }
    // Métodos getter para los atributos en una sola línea
    public String getNombre() { return nombre; }
    public String getApellido1() { return apellido1; }
    public String getApellido2() { return apellido2; }
    // Metodo getter que devuelve el nombre completo
    public String getNombreCompleto() { return nombre + " " + apellido1 + " " + apellido2; }
}
class OficinaPadron {
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>(); // Lista de habitantes
    // Añadimos habitantes al padrón
    public void annadir(Habitante habitante) { habitantesPadron.add(habitante); }
    // Obtenemos la lista de habitantes
    public ArrayList<Habitante> getHabitantesPadron() { return habitantesPadron; }
    // Calculamos el número total de habitantes
    public int calcularNumeroHabitantes() { return habitantesPadron.size(); }
}
class Comprobacion {
    public static void realizarComprobacion() {
        // Creamos tres objetos Habitante
        Habitante habitante1 = new Habitante("Miguel", "Gonzalo", "Vázquez");
        Habitante habitante2 = new Habitante("Pablo", "Molina", "García");
        Habitante habitante3 = new Habitante("Joaquin", "Vicente", "De Abad");

        OficinaPadron padron = new OficinaPadron(); // Creamos el padrón
        padron.annadir(habitante1); padron.annadir(habitante2); padron.annadir(habitante3); // Añadimos habitantes

        // Obtener la lista de habitantes y mostrarlos por pantalla
        for (Habitante habitante : padron.getHabitantesPadron())
            System.out.println(habitante.getNombre() + " " + habitante.getApellido1() + " " + habitante.getApellido2());

        // Mostrar el número total de habitantes
        System.out.println("El número total de habitantes es " + padron.calcularNumeroHabitantes());
    }
    // Ejecutamos el programa tras realizar la comprobación
    public static void main(String[] args) { realizarComprobacion(); }
}