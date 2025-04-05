public class Paciente {
    // Atributos
    String nombre;
    int edad;
    String num_expediente;

    // Métodos
    public void saludar() {
        System.out.println("\nEl nombre del paciente es: " + nombre);
        System.out.println("La edad del paciente es: " + edad +" años");
        System.out.println("El número de expediente del paciente es: " + num_expediente);
    }
}
