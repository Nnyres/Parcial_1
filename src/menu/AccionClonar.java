package src.menu;

import src.juguete.Juguete;
import src.juguete.Peluche;
import src.juguete.CreadorPeluche;

import java.util.Collections;
import java.util.Scanner;

import static src.menu.Menu.juguetes;

public class AccionClonar implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void aplicar() {

        Juguete juguete;
        System.out.println("Ingrese el Id de Juguete que desea Clonar: ");
        int clonar= scanner.nextInt();

        boolean eliminado = false;
        for (Juguete juguete1: juguetes) {
            if (juguete1.getid() == clonar) {
                Juguete jugueteClon = juguete1.clone(juguetes.size());
                juguetes.add(jugueteClon);
                eliminado = true;
                break;
            }
        }


    }

    @Override
    public int getOpcion() {
        return 2;
    }
}
