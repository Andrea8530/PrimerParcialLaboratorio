public class Impresora extends ProductoInformatico implements  iOferta{
    private Integer impresionesXminuto;

    public Impresora() {
    }

    public Impresora(int stock, String nombre, double precio, String nombrefabricante, Integer impresionesXminuto) {
        super(stock, nombre, precio, nombrefabricante);
        this.impresionesXminuto = impresionesXminuto;
    }

    public Integer getImpresionesXminuto() {
        return impresionesXminuto;
    }

    public void setImpresionesXminuto(Integer impresionesXminuto) {
        this.impresionesXminuto = impresionesXminuto;
    }

    @Override
    public String toString() {
        return super.toString()+"Impresora{" +
                "impresionesXminuto=" + impresionesXminuto +
                '}';
    }

    @Override
    public double descuentoEspecial(Double descuento) {
        return getPrecio()-(descuento*getPrecio()/100);
    }
}
