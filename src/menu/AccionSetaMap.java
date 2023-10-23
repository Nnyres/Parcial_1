package src.menu;

import src.juguete.Juguete;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static src.menu.Menu.juguetes;

public class AccionSetaMap implements Accion{
    @Override
    public void aplicar() {
        System.out.println("MAP");

        Juguete juguete;

        juguetes.stream()
                .collect(Collectors.toMap(Juguete::getid, juguete1 -> juguete1))
                .forEach((id, juguete1) -> System.out.println("Key-> " + id + " - " + "Value-> " + juguete1));
    }

    @Override
    public int getOpcion() {
        return 7;
    }
}
