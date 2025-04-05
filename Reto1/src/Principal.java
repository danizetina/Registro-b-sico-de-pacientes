import java.util.Scanner;
public class Principal {
    public static void main (String[] args){

        Paciente paciente1 = new Paciente();
        Scanner scanner = new Scanner(System.in);

        // Nombre
        System.out.print("Ingrese el nombre del paciente\n");
        paciente1.nombre = scanner.nextLine();

        // Edad
        System.out.print("Ingrese la edad del paciente\n");
        paciente1.edad  = scanner.nextInt();
        scanner.nextLine();

        // Número de expediente
        System.out.print("Ingrese el número de expediente del paciente\n");
        paciente1.num_expediente = scanner.nextLine();

        paciente1.saludar();  //Mostrar datos
        scanner.close();
    }
}