package src.juguete;

public class Peluche implements Juguete {

    private String materialExterior;
    private String relleno;
    private String color;
    private long id;

    public Peluche(String materialExterior, String relleno, String color, long id) {
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
        this.id = id;
    }

    public Peluche(Juguete peluche) {
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Peluche{" +
                "materialExterior='" + materialExterior + '\'' +
                ", relleno='" + relleno + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }

    public static PelucheBuilder builder(){

        return new PelucheBuilder();
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

    public Peluche clone() {
        return new Peluche(this);
    }

    public static class PelucheBuilder {
        private String materialExterior;
        private String relleno;
        private String color;
        private long id;

        public PelucheBuilder materialExterior (String materialExterior){
            this.materialExterior = materialExterior;
            return this;
        }

        public PelucheBuilder relleno (String relleno){
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder color (String color){
            this.color = color;
            return this;
        }

        public PelucheBuilder id (long id){
            this.id = id;
            return this;
        }

        public Peluche build (){

            return new Peluche(materialExterior, relleno, color, id);
        }

    }
}

