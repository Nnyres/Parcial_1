package src.juguete;

import src.menu.Menu;

import java.util.Collections;
import java.util.Scanner;

import static src.menu.Menu.juguetes;

public class CreadorCarrito implements CreadorJuguete {

    @Override
    public Juguete crear() {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println(" <<< Estas Creando un Peluche >>> ");
            Long id = Long.valueOf(juguetes.size());
            System.out.println(">Ingrese la marca del carrito");
            String marca = scanner.nextLine();
            System.out.println(">Ingrese el color del carrito");
            String color = scanner.nextLine();
            System.out.println("Ingrese la cantidad de puertas del carrito");
            int numeroPuertas = scanner.nextInt();


            Carrito carrito = new Carrito.CarritoBuilder()

                    .numeroPuertas(numeroPuertas)
                    .color(color)
                    .marca(marca)
                    .id(id)
                    .build();

            juguetes.add(carrito);

            System.out.println("---------------------------------------------------------");
            System.out.println("                    CARRITO CREADO                       ");
            System.out.println(carrito);
            System.out.println("---------------------------------------------------------");
            return carrito;

        } catch (Exception e) {
            System.out.println("""
                    ----------------------------------------------------------------
                            X> La cantidad de puertas debe ser un numero <X
                    ----------------------------------------------------------------
                    """);
        }

        return null;
    }

}