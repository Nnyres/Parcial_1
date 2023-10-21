package src.menu;

import src.juguete.Juguete;

import java.util.*;

import static src.menu.Menu.juguetes;

public class Menu {

    private static Menu instance;
    public static Set<Juguete> juguetes = new LinkedHashSet<>();


    private AccionHandler accionHandler = new AccionHandler();

    public Menu(){} //Debe ser privado

    public static Menu getInstance(){
        if (instance == null){
            instance = new Menu();
        }
        return instance;
    }

}
