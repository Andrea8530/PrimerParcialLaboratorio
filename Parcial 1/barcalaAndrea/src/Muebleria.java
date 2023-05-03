import java.util.ArrayList;
import java.util.List;

public class Muebleria {
    private List<Producto> listaDeProductos;

    public Muebleria() {
        this.listaDeProductos = new ArrayList<>();
    }

    public void agregarProductoAlista(Producto producto){
        listaDeProductos.add(producto);
    }

    public void recorrerYmostrar(){
        for(Producto producto:listaDeProductos){
            if(producto instanceof Impresora){
                System.out.println("IMPRESORA = "+producto);
            }else if(producto instanceof Notebook){
                System.out.println("NOTEBOOK = "+producto);
            }else if(producto instanceof Escritorio){
                System.out.println("ESCRITORIO = "+producto);
            }else {
                System.out.println("SILLA = "+producto);
            }
        }
    }
    public void aumentarTodosLosProductos(){
        for(Producto producto:listaDeProductos){
            if(producto instanceof Impresora){
                System.out.println("IMPRESORA = "+producto.getPrecio());
                producto.setPrecio((15* producto.getPrecio()/100)+producto.getPrecio());
                System.out.println("IMPRESORA con aumento = "+producto.getPrecio());
            }else if(producto instanceof Notebook){
                System.out.println("NOTEBOOK = "+producto.getPrecio());
                producto.setPrecio((20* producto.getPrecio()/100)+producto.getPrecio());
                System.out.println("NOTEBOOK con aumento = "+producto.getPrecio());
            }else if(producto instanceof Escritorio){
                System.out.println("ESCRITORIO = "+producto.getPrecio());
                producto.setPrecio((10* producto.getPrecio()/100)+producto.getPrecio());
                System.out.println("ESCRITORIO con aumento= "+producto.getPrecio());
            }else {
                System.out.println("SILLA = "+producto.getPrecio());
                producto.setPrecio((5* producto.getPrecio()/100)+producto.getPrecio());
                System.out.println("SILLA con aumento= "+producto.getPrecio());
            }
        }
    }


    @Override
    public String toString() {
        return "Muebleria{" +
                "listaDeProductos=" + listaDeProductos +
                '}';
    }
}
