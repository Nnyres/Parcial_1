package src.menu;

public class AccionEliminarPorColor implements Accion{
    @Override
    public void aplicar() {
        System.out.println("Eliminar por Color");

    }

    @Override
    public int getOpcion() {
        return 8;
    }
}
