package src.menu;

import com.sun.source.doctree.SeeTree;
import src.juguete.Juguete;
import java.util.stream.Collectors;
import src.juguete.Peluche;
import src.juguete.Carrito;

import java.util.*;

import static src.menu.Menu.juguetes;

public class AccionImprimir implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    AccionRegistro listaJuguetes = new AccionRegistro();


    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("                    >>>>>JUGUETERIA<<<<<");
            System.out.println("------------------------------------------------------------");
            System.out.println("              > No hay Juguetes para Filtrar <");
            return;
        }
        listaJuguetes.aplicar();
        System.out.println("---------------------------------------------------------------");
        System.out.println("""
            -------------------------
            ¿Que Juguetes desea imprimir?
                1. Carritos
                2. Peluches
            ------------------------- 
            """);
        System.out.println("---------------------------------------------------------------");

        List<Juguete> jugueteFiltrado = new ArrayList<>(juguetes);

        int imprimir= scanner.nextInt();
        if (imprimir == 1){
            System.out.println("> Los Carritos de la Jugueteria son: ");
            jugueteFiltrado.stream()
                    .filter(jugueteF -> jugueteF instanceof Carrito)
                    .sorted(Comparator.comparing(jugueteF -> jugueteF.getid(), Comparator.reverseOrder()))
                    .forEach(System.out::println);
            System.out.println("---------------------------------------------------------------");
        }
        else if (imprimir == 2) {
            System.out.println("> Los Peluches de la Jugueteria son: ");
            jugueteFiltrado.stream()
                    .filter(jugueteF -> jugueteF instanceof Peluche)
                    .sorted(Comparator.comparing(jugueteF -> jugueteF.getid(), Comparator.reverseOrder()))
                    .forEach(System.out::println);
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("*Por favor seleccione un juguete existente*");
        }

    }

    @Override
    public int getOpcion() {
        return 5;
    }
}
