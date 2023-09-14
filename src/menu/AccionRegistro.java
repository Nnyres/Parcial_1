package src.menu;

import src.juguete.Juguete;

import static src.menu.Menu.juguetes;

public class AccionRegistro implements Accion{
    @Override
    public void aplicar() {

        for (Juguete juguete: juguetes) {
            System.out.println(juguete);
        }

    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
