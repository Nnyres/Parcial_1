package src.juguete;

public class Peluche implements Juguete {
    private long id;
    private String materialExterior;
    private String relleno;
    private String color;


    public Peluche(long id, String materialExterior, String relleno, String color) {
        this.id = id;
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;

    }

    public Peluche(Peluche peluche, int id) {
        this.id = id;
        this.materialExterior = peluche.materialExterior;
        this.relleno = peluche.relleno;
        this.color = peluche.color;

    }


    @Override
    public String toString() {
        return "PELUCHE:" +
                "| ID=" + (id+1) +
                "| MATERIAL EXTERIOR='" + materialExterior + '\'' +
                "| RELLENO='" + relleno + '\'' +
                "| COLOR='" + color + '\'' +
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
        return null;
    }


    @Override
    public Juguete setid(int i) {
        this.id = i;
        return null;
    }

    @Override
    public Juguete clone(int id) {
        return new Peluche(this,id);
    }


    public static class PelucheBuilder {
        private long id;
        private String materialExterior;
        private String relleno;
        private String color;

        public PelucheBuilder id (long id){
            this.id = id;
            return this;
        }

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


        public Peluche build (){

            return new Peluche(id,materialExterior, relleno, color);
        }

    }
}

