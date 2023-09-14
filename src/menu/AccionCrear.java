package src.menu;

import src.juguete.*;
import src.menu.Menu;

import java.util.Scanner;
public class AccionCrear implements Accion{
    private static Scanner scanner = new Scanner(System.in);

    CreadorCarrito creadorCarrito = new CreadorCarrito();
    CreadorPeluche creadorPeluche = new CreadorPeluche();
    Integer op = null;
    @Override
    public void aplicar() {
        int contador = 0;

        System.out.println("""
            -------------------------
            ¿Que Juguete desea crear?
                1. Peluche
                2. Carrito
            ------------------------- 
            """);
        try {
            op = Integer.parseInt(scanner.nextLine());
            if (op == 1){
                creadorPeluche.crear();

            } else if (op == 2) {
                creadorCarrito.crear();

            } else {
                System.out.println("Opción no valida");
            }
        } catch (NumberFormatException e) {
            System.out.println("""
                 ---------------------
                 X Opción no valida X
                 ---------------------
                 Por favor seleccione una opción del menú
                 """);

        }

    }

    @Override
    public int getOpcion() {

        return 1;
    }
}
