public abstract class ProductoInformatico extends Producto{
    private String nombrefabricante;

    public ProductoInformatico() {
    }

    public ProductoInformatico(int stock, String nombre, double precio, String nombrefabricante) {
        super(stock, nombre, precio);
        this.nombrefabricante = nombrefabricante;
    }

    public String getNombrefabricante() {
        return nombrefabricante;
    }

    public void setNombrefabricante(String nombrefabricante) {
        this.nombrefabricante = nombrefabricante;
    }

    @Override
    public String toString() {
        return super.toString()+"ProductoInformatico{" +
                "nombrefabricante='" + nombrefabricante + '\'' +
                '}';
    }
}
