package src.menu;

import src.juguete.Juguete;
import src.juguete.Peluche;
import src.juguete.CreadorPeluche;

import java.util.Collections;
import java.util.Scanner;

import static src.menu.Menu.juguetes;

public class AccionClonar implements Accion{

    private static Scanner scanner = new Scanner(System.in);

    AccionRegistro listaJuguetes = new AccionRegistro();
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("                    >>>>>JUGUETERIA<<<<<");
            System.out.println("------------------------------------------------------------");
            System.out.println("              > No hay Juguetes, por favor crea uno <");
            return;
        }
        try {


        System.out.println("---------------------------------------------------------------");
        System.out.println(">Por favor Seleccione de la lista el Juguete que desea Clonar: ");
        System.out.println("---------------------------------------------------------------");
        listaJuguetes.aplicar();
        System.out.println("");
        int clonar= scanner.nextInt();
        System.out.println("---------------------------------------------------------------");

        System.out.println("¿Cuantos Juguetes desea Clonar? ");
        int nClonar= scanner.nextInt();
        System.out.println("---------------------------------------------------------------");

        int clon = 1;
        for (int i = 0; i < (nClonar); i++) {
            for (Juguete juguete: juguetes) {
                if (juguete.getid() == clonar-1) {
                    Juguete jugueteClon = juguete.clone(juguetes.size());
                    juguetes.add(jugueteClon);
                    clon = 2;
                    break;
                }

            }

        }
            System.out.println("---------------------------------------------------------------");
            System.out.println("Clonación Exitosa");
            System.out.println("---------------------------------------------------------------");

        if (clon == 1) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("El Juguete selccionado no existe");
        System.out.println("---------------------------------------------------------------");
        }


        }catch (Exception e){
            System.out.println("""
                 ----------------------------------------------
                             X Opción no valida X
                 ----------------------------------------------
                 >Por favor seleccione un Juguete de la lista<
                 """);
        }

    }

    @Override
    public int getOpcion() {
        return 2;
    }
}
