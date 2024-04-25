package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veterinaria veterinaria = new Veterinaria("Veterinaria", "Calle Principal 123", "1234567890");

        boolean salir = false;
        while (!salir) {
            try {
                System.out.println("\nMenú:");
                System.out.println("1. Agregar paciente perro");
                System.out.println("2. Agregar paciente gato");
                System.out.println("3. Mostrar pacientes");
                System.out.println("4. Salir");
                System.out.print("Ingrese una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        if (veterinaria.getPerro() != null) {
                            System.out.println("Ya existe un paciente perro registrado.");
                            break;
                        }
                        System.out.print("Ingrese el nombre del perro: ");
                        scanner.nextLine();
                        String nombrePerro = scanner.nextLine();
                        System.out.print("Ingrese la edad del perro: ");
                        int edadPerro = scanner.nextInt();
                        System.out.print("Ingrese la raza del perro: ");
                        scanner.nextLine();
                        String razaPerro = scanner.nextLine();
                        System.out.print("Ingrese el género del perro (M/H): ");
                        String generoPerro = leerRespuestaMH(scanner);
                        System.out.print("¿El perro ladra? (S/N): ");
                        boolean ladraPerro = leerRespuestaSN(scanner);
                        System.out.print("¿El perro juega? (S/N): ");
                        boolean juegaPerro = leerRespuestaSN(scanner);
                        System.out.print("¿Al perro le gusta salir a pasear? (S/N): ");
                        boolean pasearPerro = leerRespuestaSN(scanner);

                        Perro perro = new Perro(nombrePerro, edadPerro, razaPerro, generoPerro, ladraPerro, juegaPerro, pasearPerro);
                        if (veterinaria.agregarPaciente(perro)) {
                            System.out.println("Paciente agregado correctamente.");
                        } else {
                            System.out.println("Ya hay un paciente perro registrado.");
                        }
                        break;
                    case 2:
                        if (veterinaria.getGato() != null) {
                            System.out.println("Ya existe un paciente gato registrado.");
                            break;
                        }
                        System.out.print("Ingrese el nombre del gato: ");
                        scanner.nextLine();
                        String nombreGato = scanner.nextLine();
                        System.out.print("Ingrese la edad del gato: ");
                        int edadGato = scanner.nextInt();
                        System.out.print("Ingrese la raza del gato: ");
                        scanner.nextLine();
                        String razaGato = scanner.nextLine();
                        System.out.print("Ingrese el género del gato (M/H): ");
                        String generoGato = leerRespuestaMH(scanner);
                        System.out.print("¿El gato maulla? (S/N): ");
                        boolean maullaGato = leerRespuestaSN(scanner);
                        System.out.print("¿El gato mira con desprecio? (S/N): ");
                        boolean miraConDesprecioGato = leerRespuestaSN(scanner);
                        System.out.print("¿El gato ronronea? (S/N): ");
                        boolean ronroneaGato = leerRespuestaSN(scanner);
                        System.out.print("¿Al gato le tiene miedo al agua? (S/N): ");
                        boolean bañarGato = leerRespuestaSN(scanner);

                        Gato gato = new Gato(nombreGato, edadGato, razaGato, generoGato, maullaGato, miraConDesprecioGato, ronroneaGato, bañarGato);
                        if (veterinaria.agregarPaciente(gato)) {
                            System.out.println("Paciente agregado correctamente.");
                        } else {
                            System.out.println("Ya hay un paciente gato registrado.");
                        }
                        break;
                    case 3:
                        veterinaria.mostrarPacientes();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    public static boolean leerRespuestaSN(Scanner scanner) {
        boolean respuestaValida = false;
        boolean respuesta = false;

        while (!respuestaValida) {
            String respuestaStr = scanner.next();

            if ("S".equalsIgnoreCase(respuestaStr)) {
                respuesta = true;
                respuestaValida = true;
            } else if ("N".equalsIgnoreCase(respuestaStr)) {
                respuesta = false;
                respuestaValida = true;
            } else {
                System.out.println("Respuesta inválida. Por favor, responda con S o N.");
            }
        }
        return respuesta;
    }

    public static String leerRespuestaMH(Scanner scanner) {
        boolean respuestaValida = false;
        String respuesta = "";

        while (!respuestaValida) {
            respuesta = scanner.next();

            if ("M".equalsIgnoreCase(respuesta) || "H".equalsIgnoreCase(respuesta)) {
                respuestaValida = true;
            } else {
                System.out.println("Respuesta inválida. Por favor, responda con M o H.");
            }
        }
        return respuesta.toUpperCase();
    }
}



