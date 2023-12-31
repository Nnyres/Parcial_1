package src.menu;

import src.juguete.Juguete;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static src.menu.Menu.juguetes;

public class AccionSetaMap implements Accion{
    @Override
    public void aplicar() {
        if (juguetes.isEmpty()) {
            System.out.println("                    >>>>>JUGUETERIA<<<<<");
            System.out.println("------------------------------------------------------------");
            System.out.println("              > La lista de Juguetes esta vacia <");
            return;
        }
        try {
            System.out.println(" >> MAPA DE JUGUETES << ");
            juguetes.stream()
                    .collect(Collectors.toMap(Juguete::getid, juguete1 -> juguete1))
                    .forEach((id, juguete1) -> System.out.println("Key-> " + (id + 1) + " - " + "Value-> " + juguete1));
        }catch (Exception e){
            System.out.println(" >> No se puede realizar el cambio << ");
        }
    }

    @Override
    public int getOpcion() {
        return 7;
    }
}
