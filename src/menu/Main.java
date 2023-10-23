package src.menu;

import src.juguete.Juguete;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static src.menu.Menu.juguetes;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        Map<Integer, Accion> strategy = AccionHandler.getStrategy();


          Integer opcion = null;

        do {
            System.out.println("""
                
                ****  Menú ****
                1. Crear
                2. Clonar
                3. Eliminar
                4. Registrar
                5. Imprimir Juguetes
                6. Carrito con mayor puertas
                7. Convertir de Set a Map
                8. Eliminar por Color
                0. Salir
                
                Seleccione una opción: 
                """);

            try {

                opcion = Integer.parseInt(scanner.nextLine());
                Accion accion = strategy.get(opcion);
                if (accion == null) {
                    System.out.println("""
                            ----------------------
                            Esta opción no existe
                            ----------------------
                           """);
                }else {
                    accion.aplicar();
                }

            } catch (Exception e) {
                opcion = 1000;
                System.out.println("""
                 ---------------------
                 X Opción no valida X
                 ---------------------
                 Por favor seleccione una opción del menú
                 """);
                continue;
            }


        }while (opcion != 0);
        System.out.println("Salida exitosa");



    }


}
