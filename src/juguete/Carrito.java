package src.juguete;

public class Carrito implements Juguete {


    private long id;
    private String marca;
    private String color;
    private int numeroPuertas;


    public Carrito(String color, String marca, int numeroPuertas, long id) {
        this.color = color;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.id = id;
    }

    public Carrito(Carrito carrito, int id) {
        this.color = carrito.color;
        this.marca = carrito.marca;
        this.numeroPuertas = carrito.numeroPuertas;
        this.id = id;
    }



    @Override
    public String toString() {
        return "Carrito{" +
                "| ID=" + (id+1) +
                "| MARCA='" + marca + '\'' +
                "| COLOR='" + color + '\'' +
                "| NUMERO PUERTAS=" + numeroPuertas +
                '}';
    }

    public static CarritoBuilder builder() {

        return new CarritoBuilder();
    }


    @Override
    public Long getid() {

        return id;
    }

    @Override
    public String getcorlor() {

        return color;
    }

    @Override
    public void setid(int i) {
        this.id = i;
    }

    @Override
    public Juguete clone(int id) {
        return new Carrito(this,id);
    }



    public static class CarritoBuilder {
        private String color;
        private String marca;
        private int numeroPuertas;
        private long id;

        public CarritoBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarritoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public CarritoBuilder id(long id) {
            this.id = id;
            return this;
        }

        public Carrito build() {

            return new Carrito(color, marca, numeroPuertas, id);
        }

    }
}



