package src.menu;

import src.juguete.Juguete;

import java.util.*;
import java.util.stream.Collectors;

import static src.menu.Menu.juguetes;

public class AccionEliminarPorColor implements Accion{

    AccionRegistro listaJuguetes = new AccionRegistro();

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
            Map<Integer, String> eliminarColor = new HashMap<>();
            Set<String> mostrarColor = juguetes.stream()
                    .map(juguete -> juguete.getcolor())
                    .collect(Collectors.toSet());
            System.out.println("------------------------------------------------------------");
            System.out.println("->> Los Juguetes tienen los siguientes Colores : <<-");
            mostrarColor.stream().forEach(eliminarC -> {
                eliminarColor.put(eliminarColor.size() + 1, eliminarC);
            });
            eliminarColor.forEach(((integer, eliminarC) -> System.out.println(integer + " -> " + eliminarC)));
            System.out.println(" >> Que Color desea quitar?");
            Integer colorE = scanner.nextInt();
            String opcionColor = eliminarColor.get(colorE);
            if (opcionColor != null) {
                System.out.println(" Usted eligio quitar el color:  " + opcionColor);
            } else {
                System.out.println("Color no encontrado : " + colorE);
            }

            Iterator<Juguete> eliminarCo = juguetes.iterator();
            while (eliminarCo.hasNext()) {
                Juguete juguete = eliminarCo.next();
                if (opcionColor.equals(juguete.getcolor())) {
                    eliminarCo.remove();
                }
            }

            int i = 0;
            for (Juguete juguete : juguetes) {
                juguete.setid(i++);
            }

            listaJuguetes.aplicar();

        }catch (Exception e){
            System.out.println("""
                 ----------------------------------------------
                             X Opción no valida X
                 ----------------------------------------------
                 >Por favor seleccione un Color de la lista de Juegues<
                 """);
        }


    }

    @Override
    public int getOpcion() {
        return 8;
    }
}
