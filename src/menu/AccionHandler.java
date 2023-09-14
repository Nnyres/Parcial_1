package src.menu;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccionHandler{

    private static final List<Accion> ListaDeAcciones = List.of(new AccionCrear(), new AccionClonar(),new AccionEliminar(), new AccionRegistro());

    public static Map<Integer, Accion> getStrategy() {
        Map<Integer, Accion> strategy = new HashMap<>();
        for (Accion accion : ListaDeAcciones){
            strategy.put(accion.getOpcion(), accion);
        }
        return strategy;

    }

}
