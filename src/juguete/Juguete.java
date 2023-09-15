package src.juguete;

public interface Juguete {
    Long getid();
    String getcorlor();
    void setid(int i);

    Juguete clone(int id);
}
