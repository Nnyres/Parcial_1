package src.juguete;

public class Carrito implements Juguete {


    private long id;
    private String marca;
    private String color;
    private int numeroPuertas;


    public Carrito(long id, String marca, String color, int numeroPuertas) {
        this.id = id;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;

    }

    public Carrito(Carrito carrito, int id) {
        this.color = carrito.color;
        this.marca = carrito.marca;
        this.numeroPuertas = carrito.numeroPuertas;
        this.id = id;
    }



    @Override
    public String toString() {
        return "CARRITO:" +
                "| ID=" + (id+1) +
                "| MARCA='" + marca + '\'' +
                "| COLOR='" + color + '\'' +
                "| NUMERO PUERTAS=" + numeroPuertas +
                '|';
    }

    @Override
    public Long getid() {

        return id;
    }

    @Override
    public String getcolor() {
        return color;
    }

    @Override
    public Integer getnumeroPuertas() {
        return numeroPuertas;
    }


    @Override
    public Juguete setid(int i) {
        this.id = i;
        return null;
    }

    @Override
    public Juguete clone(int id) {
        return new Carrito(this,id);
    }



    public static class CarritoBuilder {
        private long id;
        private String marca;
        private String color;
        private int numeroPuertas;

        public CarritoBuilder id(long id) {
            this.id = id;
            return this;
        }
        public CarritoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }
        public CarritoBuilder color(String color) {
            this.color = color;
            return this;
        }
        public CarritoBuilder numeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public Carrito build() {

            return new Carrito(id, marca, color, numeroPuertas);
        }

    }
}



