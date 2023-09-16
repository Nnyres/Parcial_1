package src.menu;

import src.juguete.Juguete;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import static java.util.OptionalLong.empty;
import static src.menu.Menu.juguetes;

public class AccionEliminar implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    AccionRegistro listaJuguetes = new AccionRegistro();

     Menu men = new Menu();


    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("                >>> LISTA DE JUGUETES <<<");
            System.out.println("---------------------------------------------------------------");
            System.out.println("           *** No hay Juguetes para Eliminar ***");
            System.out.println("---------------------------------------------------------------");
            return;
        }
        listaJuguetes.aplicar();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("        >>> Ingrese el Id de Juguete que desea eliminar: <<<");
        int eliminar = scanner.nextInt();
        System.out.println("-------------------------------------------------------------------");
        try {
            boolean eliminado = false;
            for (Juguete juguete : juguetes) {
                if (juguete.getid() == eliminar - 1) {
                    juguetes.remove(juguete);
                    System.out.println("---------------------------------------------------------");
                    System.out.println("    >>> Juguete eliminado con éxito <<<    ");
                    System.out.println("---------------------------------------------------------");
                    eliminado = true;
                    break;
                }


            }
            if (!eliminado) {
                System.out.println("---------------------------------------------------------");
                System.out.println("No se encontró un objeto con el id indicado");
                System.out.println("---------------------------------------------------------");
            }

            for (int i = 0; i < juguetes.size(); i++) {
                juguetes.get(i).setid(i);

            }
        }catch (Exception e) {
            System.out.println("""
                 ---------------------------------------------------------
                                 X> Opción no valida <X
                 ---------------------------------------------------------
                 **** Por favor indique el id del juguete a eliminar **** 
                 ---------------------------------------------------------""");

        }

    }


    @Override
    public int getOpcion() {

        return 3;
    }
}
