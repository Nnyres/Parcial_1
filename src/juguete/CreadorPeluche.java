package src.juguete;

import java.util.Scanner;

import static src.menu.Menu.juguetes;
public class CreadorPeluche implements CreadorJuguete{


    @Override
    public Juguete crear() {

        String materialExterior;
        String relleno;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" <<< Estas Creando un Peluche >>> ");
            System.out.println("Ingrese un color");
            String color = scanner.nextLine();
            System.out.println("Ingrese el Material Exterior");
            materialExterior = scanner.nextLine();
            System.out.println("Ingrese Relleno");
            relleno = scanner.nextLine();
            Long id = Long.valueOf(juguetes.size());


            Peluche peluche = new Peluche.PelucheBuilder()
                    .color(color)
                    .materialExterior(materialExterior)
                    .relleno(relleno)
                    .id(id)
                    .build();


            System.out.println("---------------------------------------------------------");
            System.out.println("                    PELUCHE CREADO                       ");
            System.out.println(peluche);
            System.out.println("---------------------------------------------------------");
            return peluche;

        } catch (Exception e) {
            System.out.println("""
                    ----------------------------------------------------------------
                            X> La cantidad de puertas debe ser un numero <X
                    ----------------------------------------------------------------
                    """);
        }
        return null;

    }
}