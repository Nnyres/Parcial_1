package src.juguete;

public interface Juguete {
    Long getid();
    Integer getnumeroPuertas();
    Juguete setid(int i);
    Juguete clone(int id);
}
