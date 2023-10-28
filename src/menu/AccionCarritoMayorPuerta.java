package src.menu;

import src.juguete.Carrito;
import src.juguete.Juguete;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static src.menu.Menu.juguetes;

public class AccionCarritoMayorPuerta implements Accion {

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("                    >>>>>JUGUETERIA<<<<<");
            System.out.println("------------------------------------------------------------");
            System.out.println("              > No hay Juguetes para Filtrar <");
            return;
        }
        try {
            List<Juguete> puertas = new ArrayList<>(juguetes);
            System.out.println("------------------------------------------------------------");
            System.out.println("-> El Carrito con el mayor número de puestas es: ");
            System.out.println("------------------------------------------------------------");
            puertas.stream()
                    .filter(puerta -> puerta instanceof Carrito)
                    .max(Comparator.comparing(puerta -> puerta.getnumeroPuertas()))
                    .ifPresentOrElse(System.out::println,
                            () -> System.out.println(" *** En los Juguetes no hay Carritos ***"));
            System.out.println("------------------------------------------------------------");

        }catch (Exception e){
            System.out.println("""
                 ----------------------------------------------
                             X Opción no valida X
                 ----------------------------------------------
                 """);
        }

    }

        @Override
        public int getOpcion () {
            return 6;
        }


}
