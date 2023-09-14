package src.juguete;

import src.menu.Menu;

import java.util.Collections;
import java.util.Scanner;

import static src.menu.Menu.juguetes;

public class CreadorCarrito implements CreadorJuguete {
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public Juguete crear() {

        try {
            System.out.println("Ingrese la marca del carrito");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el color del carrito");
            String color = scanner.nextLine();
            System.out.println("Ingrese la cantidad de puertas del carrito");
            int numeroPuertas = scanner.nextInt();
            Long id = Long.valueOf(juguetes.size());
            scanner.nextLine();

            Carrito carrito = new Carrito.CarritoBuilder()

                    .numeroPuertas(numeroPuertas)
                    .color(color)
                    .marca(marca)
                    .id(id)
                    .build();

            juguetes.add(carrito);
            System.out.println(carrito);
            return carrito;

        } catch (Exception e) {
            System.out.println("""
                    ---------------------
                    X La cantidad de puertas debe ser un numero X
                    ---------------------
                    """);
        }

        return null;
    }

}