public class Escritorio extends Mueble {
    private Integer alto;
    private Integer ancho;

    public Escritorio() {
    }

    public Escritorio(int stock, String nombre, double precio, Integer alto, Integer ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return super.toString()+"Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }
}
