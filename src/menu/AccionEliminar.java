package src.menu;

import src.juguete.Juguete;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import static java.util.OptionalLong.empty;
import static src.menu.Menu.juguetes;

public class AccionEliminar implements Accion{

    private static Scanner scanner = new Scanner(System.in);

     Menu men = new Menu();


    @Override
    public void aplicar() {

        System.out.println("Ingrese el Id de Juguete que desea eliminar: ");
        int eliminar = scanner.nextInt();

        boolean eliminado = false;
        for (Juguete juguete : juguetes) {
            if (juguete.getid() == eliminar - 1) {
                juguetes.remove(juguete);
                System.out.println("Objeto eliminado con éxito.");
                eliminado = true;
                break;
            }


        }
        if (!eliminado) {
            System.out.println("No se encontró un objeto con el ID especificado.");
        }

        for (int i = 0; i < juguetes.size(); i++) {
            juguetes.get(i).setid(i);

        }


    }


    @Override
    public int getOpcion() {

        return 3;
    }
}
