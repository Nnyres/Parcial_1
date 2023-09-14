package src.juguete;

import java.util.Scanner;

import static src.menu.Menu.juguetes;
public class CreadorPeluche implements CreadorJuguete{

    public static Scanner scanner = new Scanner(System.in);
    @Override
    public Juguete crear() {
        System.out.println("Ingrese un color");
        String color=scanner.nextLine();
        System.out.println("Ingrese un Material Exterior");
        String materialExtxterior= scanner.nextLine();
        System.out.println("Ingrese Relleno");
        String  relleno= scanner.nextLine();
        Long id= Long.valueOf(juguetes.size());
        scanner.nextLine();

        Peluche peluche = new Peluche.PelucheBuilder()
                .color(color)
                .materialExterior(materialExtxterior)
                .relleno(relleno)
                .id(id)
                .build();

        juguetes.add(peluche);
        System.out.println(peluche);


        return peluche;
    }
}