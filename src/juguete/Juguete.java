package src.juguete;

public interface Juguete {
    Long getid();
    void setid(int i);

    Juguete clone(int id);
}
