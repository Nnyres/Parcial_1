package src.juguete;

import java.util.Scanner;

import static src.menu.Menu.juguetes;
public class CreadorPeluche implements CreadorJuguete{


    @Override
    public Juguete crear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" <<< Estas Creando un Peluche >>> ");
        System.out.println("Ingrese un color");
        String color=scanner.nextLine();
        System.out.println("Ingrese el Material Exterior");
        String materialExtxterior= scanner.nextLine();
        System.out.println("Ingrese Relleno");
        String  relleno= scanner.nextLine();
        Long id= Long.valueOf(juguetes.size());



        Peluche peluche = new Peluche.PelucheBuilder()
                .color(color)
                .materialExterior(materialExtxterior)
                .relleno(relleno)
                .id(id)
                .build();


        juguetes.add(peluche);
        System.out.println("---------------------------------------------------------");
        System.out.println("                    PELUCHE CREADO                       ");
        System.out.println(peluche);
        System.out.println("---------------------------------------------------------");



        return peluche;
    }
}