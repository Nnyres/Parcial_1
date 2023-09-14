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
        System.out.println("Ingrese el Id de Juguete que desea Clonar: ");
        int clonar= scanner.nextInt();

        boolean eliminado = false;
        for (Juguete juguete : juguetes) {
            if (juguete.getid() == clonar) {
                Peluche clonPeluche = (Peluche) juguete;
                Peluche clonPeluche2 = clonPeluche.clone();
                juguetes.add(clonPeluche2);
                System.out.println(clonPeluche2);
                eliminado = true;
                break;
            }
        }

        for (int i = 0; i < juguetes.size(); i++) {
            juguetes.get(i).setid(i);

        }
        Collections.sort(juguetes,(uno, dos) -> Integer.compare(Math.toIntExact(uno.getid()), Math.toIntExact(dos.getid())));
    }

    @Override
    public int getOpcion() {
        return 2;
    }
}
