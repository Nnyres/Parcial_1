package src.menu;

import src.juguete.Juguete;

import static src.menu.Menu.juguetes;

public class AccionRegistro implements Accion{
    @Override
    public void aplicar() {
        System.out.println("                >>> LISTA DE JUGUETES <<<");
        System.out.println("------------------------------------------------------------");
        if (juguetes.isEmpty()) {
            System.out.println("              ****Jugueteria Vacia***   ");
            System.out.println("------------------------------------------------------------");
            return;
        }
        System.out.println("------------------------------------------------------------");
        for (Juguete juguete: juguetes) {
            System.out.println(juguete);
        }
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
