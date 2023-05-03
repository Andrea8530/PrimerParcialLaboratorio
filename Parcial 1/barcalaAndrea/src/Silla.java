public class Silla extends Mueble implements iOferta{
    private Boolean ruedas;

    public Silla() {
    }

    public Silla(int stock, String nombre, double precio, Boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return super.toString()+"Silla{" +
                "ruedas=" + ruedas +
                '}';
    }

    @Override
    public double descuentoEspecial(Double descuento) {
        return getPrecio()-(descuento*getPrecio()/100);
    }


}
