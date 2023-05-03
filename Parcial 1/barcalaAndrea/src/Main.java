public class Main {
    public static void main(String[] args) {

        Silla silla1 = new Silla(3,"Antigua", 100.0,true);
        Escritorio escritorio1 = new Escritorio(15,"Nuevo", 100, 100,150);
        Impresora impresora1 = new Impresora(12,"x32",100,"samsum", 15);
        Notebook notebook1 = new Notebook(6,"k54", 100, "lg", 256);



        Muebleria local1 = new Muebleria();

        local1.agregarProductoAlista(silla1);
        local1.agregarProductoAlista(escritorio1);
        local1.agregarProductoAlista(impresora1);
        local1.agregarProductoAlista(notebook1);

        local1.recorrerYmostrar();
        System.out.println();

        System.out.println("Con el descuento especial del 10% la silla queda en: $"+silla1.descuentoEspecial(10d));
        System.out.println("Con el descuento especial del 15% el escritorio queda en: $"+impresora1.descuentoEspecial(15d));

        System.out.println("\n    AUMENTO DE PRECIOS");
        local1.aumentarTodosLosProductos();

    }
}