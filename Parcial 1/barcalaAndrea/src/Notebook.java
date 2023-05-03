public class Notebook extends ProductoInformatico{
    private Integer memoria;

    public Notebook() {
    }

    public Notebook(int stock, String nombre, double precio, String nombrefabricante, Integer memoria) {
        super(stock, nombre, precio, nombrefabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString()+"Notebook{" +
                "memoria=" + memoria +
                '}';
    }
}
