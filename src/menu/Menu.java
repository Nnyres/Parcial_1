package src.menu;

import src.juguete.Juguete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static src.menu.Menu.juguetes;

public class Menu {

    private static Menu instance;
    public static List<Juguete> juguetes = new ArrayList<>();


    private AccionHandler accionHandler = new AccionHandler();

    public Menu(){}

    public static Menu getInstance(){
        if (instance == null){
            instance = new Menu();
        }
        return instance;
    }

}
