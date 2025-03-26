import com.formacom.Fichajes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Fichajes fichajes=new Fichajes();
        String opcionSeleccionada="";
        final String MENU_ADMINISTRADOR= """
                1. Nuevo Alumno
                2. Seleccionar Modo
                3. Ver Informes
                4. Salir
                """;
        final String MENU_ALUMNO= """
                1. Fichar
                2. Salir
                """;
        final String MENU_INFORME= """
                1. Fichajes por dia
                2. Fichajes por alumno
                3. Volver
                """;
        do {
            System.out.println(MENU_ADMINISTRADOR);
            opcionSeleccionada=leer.nextLine();
            switch (opcionSeleccionada){
                case "1":
                    System.out.println("Nombre del alumn@:");
                    String nombre=leer.nextLine();
                    System.out.println("DNI del alumn@:");
                    String dni=leer.nextLine();
                    System.out.println(fichajes.alta_alumno(dni,nombre));
                    break;
                case "2":
                    System.out.println("""
                              1.Modo Entrada
                              2.Modo Salida
                            """);
                    opcionSeleccionada=leer.nextLine();
                    if(opcionSeleccionada.equals("1")){
                        System.out.println(fichajes.cambiar_modo("Entrada"));
                    }else{
                        System.out.println(fichajes.cambiar_modo("Salida"));
                    }

                    break;
                case "3":

                break;
                case "4":

                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }while (! opcionSeleccionada.equals("4"));

    }
}