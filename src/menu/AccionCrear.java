package src.menu;

import src.juguete.*;
import src.menu.Menu;

import java.util.Scanner;

import static src.menu.Menu.juguetes;

public class AccionCrear implements Accion{
    private static Scanner scanner = new Scanner(System.in);

    CreadorCarrito creadorCarrito = new CreadorCarrito();
    CreadorPeluche creadorPeluche = new CreadorPeluche();
    Integer op = null;
    @Override
    public void aplicar() {

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
                juguetes.add(creadorPeluche.crear());

            } else if (op == 2) {
                juguetes.add(creadorCarrito.crear());

            } else {
                System.out.println("*Por favor seleccione una opción del menú*");
            }
        } catch (Exception e) {
            System.out.println("""
                 ---------------------
                 X>Opción no valida<X
                 ---------------------
                 *Por favor seleccione una opción del menú*
                 """);

        }

    }

    @Override
    public int getOpcion() {

        return 1;
    }
}
