package src.menu;

import java.util.Scanner;

public class AccionImprimir implements Accion{

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void aplicar() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("""
            -------------------------
            ¿Que Juguetes desea imprimir?
                1. Peluches
                2. Carritos
            ------------------------- 
            """);
        System.out.println("---------------------------------------------------------------");
        int imprimir= scanner.nextInt();


    }

    @Override
    public int getOpcion() {
        return 5;
    }
}
