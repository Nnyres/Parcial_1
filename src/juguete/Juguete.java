package src.juguete;

public interface Juguete {
    Long getid();
    String getcolor();
    Integer getnumeroPuertas();
    Juguete setid(int i);
    Juguete clone(int id);
}
